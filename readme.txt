pašlaik kļūda notiek ar pieprasījumiem - ļoti iespējams, ka viņš nespēj atrast pareizo URL mainīgo, kas nozīmē, ka viņš atgriež neko.. jāskatās, kā pareizi uzrakstīt to. 
var mēģināt izmantot SerializedName???


tas bija no yt video, kur fujaks darījo to pašu, var atrast history yt
this: 
package com.example.myapplication

import com.google.gson.annotations.SerializedName

data class DataResult(
    @SerializedName("data") val res: List<DataObject>
)
data class DataObject(
    @SerializedName("images") val images: DataImage
)
data class DataImage(
    @SerializedName("original") val ogImage: ogImage
)

data class ogImage(
    val url: String
) 