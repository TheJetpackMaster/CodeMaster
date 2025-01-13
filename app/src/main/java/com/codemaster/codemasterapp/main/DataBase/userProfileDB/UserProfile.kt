package com.codemaster.codemasterapp.main.DataBase.userProfileDB;


import android.content.Context
import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters


@Entity(tableName = "user_profiles")
data class UserProfile(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val userId: Int = 0,

    @ColumnInfo(name = "username")
    val username: String,

    @ColumnInfo(name = "profile_picture")
    val profilePicture: ByteArray? = null
)

//@Entity(tableName = "user_profiles")
//data class UserProfile(
//    @PrimaryKey(autoGenerate = true)
//    @ColumnInfo(name = "user_id")
//    val userId: Int = 0,
//
//    @ColumnInfo(name = "username")
//    val username: String,
//
//    @ColumnInfo(name = "email")
//    val email: String? = null, // Nullable for guests
//
//    @ColumnInfo(name = "password")
//    val password: String? = null, // Nullable for guests
//
//    @ColumnInfo(name = "profile_picture_url")
//    val profilePictureUrl: String? = null // Optional field
//)


@Dao
interface UserProfileDao {

    // Insert or update the guest profile (always replace the latest guest profile)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateGuestProfile(userProfile: UserProfile)

    // Fetch the latest guest profile
    @Query("SELECT * FROM user_profiles ORDER BY user_id DESC LIMIT 1")
    suspend fun getLatestGuestProfile(): UserProfile?
}


//@Dao
//interface UserProfileDao {
//
//    // Insert or update a user profile
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun insertUserProfile(userProfile: UserProfile)
//
//    // Login for registered users
//    @Query("SELECT * FROM user_profiles WHERE email = :email AND password = :password LIMIT 1")
//    suspend fun login(email: String, password: String): UserProfile?
//
//    // Fetch user profile by ID
//    @Query("SELECT * FROM user_profiles WHERE user_id = :userId")
//    suspend fun getUserProfileById(userId: Int): UserProfile?
//
//    // Update profile picture
//    @Query("UPDATE user_profiles SET profile_picture_url = :profilePictureUrl WHERE user_id = :userId")
//    suspend fun updateProfilePicture(userId: Int, profilePictureUrl: String)
//
//    // Fetch guest profiles
//    @Query("SELECT * FROM user_profiles WHERE email IS NULL AND password IS NULL")
//    suspend fun getAllGuestProfiles(): List<UserProfile>
//}




@Database(entities = [UserProfile::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class) // Register the converters here
abstract class UserProfileDB : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao

    companion object {
        @Volatile
        private var INSTANCE: UserProfileDB? = null

        fun getDatabase(context: Context): UserProfileDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserProfileDB::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}


class UserProfileRepository(private val dao: UserProfileDao) {
    suspend fun createOrUpdateGuestProfile(username: String, profilePicture: ByteArray?) {
        val guestProfile = UserProfile(username = username, profilePicture = profilePicture)
        dao.insertOrUpdateGuestProfile(guestProfile)
    }

    suspend fun getLatestGuestProfile(): UserProfile? {
        return dao.getLatestGuestProfile()
    }
}


//
//class UserProfileRepository(private val dao: UserProfileDao) {
//
//    // Create a regular user profile
//    suspend fun createUserProfile(username: String, email: String, password: String) {
//        val userProfile = UserProfile(username = username, email = email, password = password)
//        dao.insertUserProfile(userProfile)
//    }
//
//    // Create a guest profile
//    suspend fun createGuestProfile(username: String, profilePictureUrl: String?) {
//        val guestProfile = UserProfile(username = username, profilePictureUrl = profilePictureUrl)
//        dao.insertUserProfile(guestProfile)
//    }
//
//    // Login for regular users
//    suspend fun login(email: String, password: String): UserProfile? {
//        return dao.login(email, password)
//    }
//
//    // Fetch user profile by ID
//    suspend fun getUserProfileById(userId: Int): UserProfile? {
//        return dao.getUserProfileById(userId)
//    }
//
//    // Update profile picture
//    suspend fun updateProfilePicture(userId: Int, profilePictureUrl: String) {
//        dao.updateProfilePicture(userId, profilePictureUrl)
//    }
//
//    // Fetch all guest profiles
//    suspend fun getAllGuestProfiles(): List<UserProfile> {
//        return dao.getAllGuestProfiles()
//    }
//}

class Converters {
    @TypeConverter
    fun fromByteArray(byteArray: ByteArray?): String? {
        return byteArray?.let { android.util.Base64.encodeToString(it, android.util.Base64.DEFAULT) }
    }

    @TypeConverter
    fun toByteArray(encodedString: String?): ByteArray? {
        return encodedString?.let { android.util.Base64.decode(it, android.util.Base64.DEFAULT) }
    }
}
