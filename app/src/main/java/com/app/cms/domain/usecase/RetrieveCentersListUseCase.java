package com.app.cms.domain.usecase;

import com.app.cms.data.MaintenanceCenterRepository;
import com.app.cms.model.MaintenanceCenter;

import java.util.List;

import androidx.lifecycle.MutableLiveData;

public class RetrieveCentersListUseCase {

    private final MaintenanceCenterRepository maintenanceCenterRepository;

    public RetrieveCentersListUseCase(MaintenanceCenterRepository maintenanceCenterRepository) {
        this.maintenanceCenterRepository = maintenanceCenterRepository;
    }

    public void execute(MutableLiveData<List<MaintenanceCenter>> allCentersLiveData) {
        maintenanceCenterRepository.retrieveAllCenters(allCentersLiveData);
    }

    public void executeByCategoryServiceId(String categoryId, String serviceId, MutableLiveData<List<MaintenanceCenter>> centersListMutableLiveData) {
        maintenanceCenterRepository.retrieveCentersByCategoryServiceId(categoryId, serviceId, centersListMutableLiveData);
    }
}
