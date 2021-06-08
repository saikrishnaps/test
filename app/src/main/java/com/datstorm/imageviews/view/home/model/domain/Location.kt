package com.datstorm.estore.view.categories.model.domain

data class Location(
    val DeliveryFee: Double,
    val DestinationLatitude: Double,
    val DestinationLongitude: Double,
    val Distance: Double,
    val DistanceCovered: Double,
    val DistanceUnit: Int,
    val MinimumOrder: Double,
    val SourceLatitude: Double,
    val SourceLongitude: Double,
    val CreditLimit: Double,
    val Follower: Int,
    val Rating: Double,
    val Unit: String
)