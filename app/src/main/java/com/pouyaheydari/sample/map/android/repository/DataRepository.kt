package com.pouyaheydari.sample.map.android.repository

import com.pouyaheydari.sample.map.android.pojo.Vehicle
import com.pouyaheydari.sample.map.android.pojo.VehiclesData
import com.pouyaheydari.sample.map.android.repository.local.LocalRepository
import com.pouyaheydari.sample.map.android.repository.network.NetworkRepository

class DataRepository(
    private val networkRepository: NetworkRepository,
    private val localRepository: LocalRepository
) : DataRepositoryInterface {

    override suspend fun getVehicles(): VehiclesData = networkRepository.getVehicles()

    override suspend fun getOfflineVehicles(): List<Vehicle> = localRepository.getOfflineVehicles()

    override suspend fun deleteAllVehicles() = localRepository.deleteAllVehicles()

    override suspend fun insertVehicle(vehicle: Vehicle) = localRepository.insertVehicle(vehicle)
}