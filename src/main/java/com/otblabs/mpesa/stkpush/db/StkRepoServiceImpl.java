package com.otblabs.mpesa.stkpush.db;

import com.otblabs.mpesa.stkpush.StkService;
import com.otblabs.mpesa.stkpush.models.LNMResult;

public class StkRepoServiceImpl implements stkRepoService {
    private final StkDataRepo stkDataRepo;

    public StkRepoServiceImpl(StkDataRepo stkDataRepo) {
        this.stkDataRepo = stkDataRepo;
    }


    @Override
    public void postDataToDb(StkResponseData stkResponseData) {
        stkDataRepo.save(stkResponseData);
    }
}
