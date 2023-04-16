/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jerryreddy
 */
public class PSH_location {
   private String name;
    private PSH_EnterpriseCatalogDirectory EnterpriseCatalogDirectory;

    public PSH_location(String name) {
        this.name = name;
        EnterpriseCatalogDirectory = new PSH_EnterpriseCatalogDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PSH_EnterpriseCatalogDirectory getEnterpriseCatalogDirectory() {
        return EnterpriseCatalogDirectory;
    }

    public void setBusinessCatalogueDirectory(PSH_EnterpriseCatalogDirectory EnterpriseCatalogDirectory) {
        this.EnterpriseCatalogDirectory = EnterpriseCatalogDirectory;
    }
   

    public String toString()

    {
        return name;
    }
}
