package DatabaseFiles.ServicesInterface;

import Model.Admin;

/**
 *
 * @author Eng Eslam khder
 */
public interface AdminService {
    // Get Data Of Admin
    public Admin getAdmin();
    
    /* Check IF Client Is Exist Or Not 
       IF Exist (Return All Data Of Client)
       IF Not Exist (Return Null)
     */
    public Admin IsExist(Admin admin);
}
