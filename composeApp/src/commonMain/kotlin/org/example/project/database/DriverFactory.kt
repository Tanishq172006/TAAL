package org.example.project.database

import app.cash.sqldelight.db.SqlDriver

expect class DriverFactory {
    fun createDriver(): SqlDriver
}

fun createDatabase(driverFactory: DriverFactory): BeatsQueries {
    val driver = driverFactory.createDriver()
    val d1 = BeatsQueries(driver)
    return d1
}
fun createdDatabase(driverFactory: DriverFactory): SelectedBeatsQueries {
    val driver = driverFactory.createDriver()
    val d2 = SelectedBeatsQueries(driver)
    return d2
}