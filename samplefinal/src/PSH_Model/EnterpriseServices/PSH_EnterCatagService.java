/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PSH_Model.EnterpriseServices;

import Model.PSH_EnterpriseCatalog;
import Model.PSH_Organization;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import main.DateUtilities;

/**
 *
 * @author nayankarumuri
 */
public abstract class PSH_EnterCatagService {
    protected static final String TAB = "      ";

    static enum ServiceType {
        CELEBRATION,
        RESTAURANT,
        THEATRE,
        HOTEL,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    protected PSH_EnterpriseCatalog enterpriseCatalog;
    private Status status;
    protected int totalCost;
    private List<PSH_Organization> listOfOrganization;

    PSH_EnterCatagService(PSH_EnterpriseCatalog enterpriseCatalogue, ServiceType serviceType, Date date) {
        this.enterpriseCatalog = enterpriseCatalogue;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtilities.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrganization = new ArrayList<>();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public PSH_EnterpriseCatalog getEnterpriseCatalog() {
        return enterpriseCatalog;
    }

    public void setEnterpriseCatalog(PSH_EnterpriseCatalog enterpriseCatalog) {
        this.enterpriseCatalog = enterpriseCatalog;
    }

   

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrganization(PSH_Organization org) {
        listOfOrganization.add(org);
    }

    public List<PSH_Organization> getListOfOrganization() {
        return listOfOrganization;
    }

    public void setListOfOrganization(List<PSH_Organization> listOfOrganization) {
        this.listOfOrganization = listOfOrganization;
    }

    public abstract String toString();
}
