package az.layer.data.data_source.remote.dto

import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName("posts")
    val posts: List<Body>?
)

data class Body(
    @SerializedName("content")
    val content: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("picture")
    val picture: String?,
    @SerializedName("user")
    val user: User?
)

data class User(
    @SerializedName("headline")
    val headline: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("profile_img")
    val profileImg: String?
)