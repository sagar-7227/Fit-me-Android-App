package com.google.mlkit.vision.demo.kotlin

import android.os.Parcel
import android.os.Parcelable

data class PlanetData(
    val id:Int?,
    val title:String?,
    val galaxy:String?,
    val overview:String?

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(galaxy)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlanetData> {
        override fun createFromParcel(parcel: Parcel): PlanetData {
            return PlanetData(parcel)
        }

        override fun newArray(size: Int): Array<PlanetData?> {
            return arrayOfNulls(size)
        }
    }
}
