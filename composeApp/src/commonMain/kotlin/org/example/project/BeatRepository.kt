package org.example.project

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import org.example.project.database.Beats
import org.example.project.database.BeatsQueries
import org.example.project.database.DriverFactory
import org.example.project.database.SelectedBeats
import org.example.project.database.SelectedBeatsQueries
import org.example.project.database.createDatabase
import org.example.project.database.createdDatabase

class BeatsRepository(driverFactory: DriverFactory) {
    private val d1 = createDatabase(driverFactory)
    private val d2 = createdDatabase(driverFactory)
    private val beatQuery = d1.selectAllBeats()
    private val selectedQuery = d2.showSelectedBeats()

    fun getAllBeats(): Flow<List<Beats>> =
        beatQuery.asFlow().mapToList(Dispatchers.Default)

    fun getSelectedBeats(): Flow<List<SelectedBeats>> =
        selectedQuery.asFlow().mapToList(Dispatchers.Default)

    suspend fun selectBeat(beatId: Long) {
        withContext(Dispatchers.Default) {
            d2.markAsSelected(beatId)
        }
    }
}