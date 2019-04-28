package ac.za.cput.repository.HeadOffice.Impl;

import ac.za.cput.domain.HeadOffice;
import ac.za.cput.repository.HeadOffice.HeadOfficeRepository;

import java.util.HashSet;
import java.util.Set;

public class HeadOfficeRepositoryImpl implements HeadOfficeRepository {
    private static HeadOfficeRepositoryImpl repository = null;
    private Set<HeadOffice> offices;

    private HeadOfficeRepositoryImpl(){
        this.offices = new HashSet<>();
    }

    public static HeadOfficeRepositoryImpl getRepository(){
        if (repository == null) repository = new HeadOfficeRepositoryImpl();
        return repository;
    }


    public HeadOffice create(HeadOffice office){
        this.offices.add(office);
        return office;
    }

    public HeadOffice read(String officeId){
        // find the course that matches the id and return it if exist
        return null;
    }

    public void delete(String officeId) {
        // find the course, delete it if it exist
    }

    public HeadOffice update(HeadOffice office){
        // find the course, update it and delete it if it exists
        return office;
    }


    public Set<HeadOffice> getAll(){
        return this.offices;
    }
}
