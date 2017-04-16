package Modele;
// Generated 2016-11-10 10:52:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Locations generated by hbm2java
 */
public class Locations  implements java.io.Serializable {


     private short locationId;
     private String streetAddress;
     private String postalCode;
     private String city;
     private String stateProvince;
     private String countryId;
     private Set departmentses = new HashSet(0);

    public Locations() {
    }

	
    public Locations(short locationId, String city) {
        this.locationId = locationId;
        this.city = city;
    }
    public Locations(short locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId, Set departmentses) {
       this.locationId = locationId;
       this.streetAddress = streetAddress;
       this.postalCode = postalCode;
       this.city = city;
       this.stateProvince = stateProvince;
       this.countryId = countryId;
       this.departmentses = departmentses;
    }
   
    public short getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(short locationId) {
        this.locationId = locationId;
    }
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getStateProvince() {
        return this.stateProvince;
    }
    
    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }
    public String getCountryId() {
        return this.countryId;
    }
    
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }
    public Set getDepartmentses() {
        return this.departmentses;
    }
    
    public void setDepartmentses(Set departmentses) {
        this.departmentses = departmentses;
    }




}


