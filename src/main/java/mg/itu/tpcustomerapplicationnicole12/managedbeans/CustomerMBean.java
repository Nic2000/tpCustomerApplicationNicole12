/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tpcustomerapplicationnicole12.managedbeans;

import javax.ejb.EJB;  
import javax.inject.Named;  
import javax.faces.view.ViewScoped;  
import java.io.Serializable;  
import java.util.List;  
import mg.itu.tpcustomerapplicationnicole12.entities.Customer;
import mg.itu.tpcustomerapplicationnicole12.session.CustomerManager;

/**
 *
 * @author Nicole
 */
@Named(value = "customerMBean")
@ViewScoped
public class CustomerMBean implements Serializable {
    private List<Customer> customerList;  
    @EJB
    private CustomerManager customerManager;

    /** 
   * Retourne la liste des clients pour affichage dans une DataTable 
   * @return 
   */  
    public CustomerMBean() {
    }
    public List<Customer> getCustomers() {
        if (customerList == null) {
          customerList = customerManager.getAllCustomers();
        }
    return customerList;
    }  
    
}
