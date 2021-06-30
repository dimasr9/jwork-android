package dimasradhitya.jwork_android;

/**
 * Class yang menyimpan fungsi-fungsi Recruiter
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class Recruiter {
    private int id;
    private String name, email, phoneNumber;
    private Location location;

    /**
     * Constructor untuk object dari class Recruiter
     * @param id dari recruiter
     * @param name nama dari recruiter
     * @param phoneNumber nomor telepon dari recruiter
     * @param location objek lokasi dari class Location
     */
    public Recruiter(int id,String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    /**
     * getter id dari recruiter
     * @return id dari recruiter
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * getter nama dari recruiter
     * @return name dari recruiter
     */
    public String getName(){
        return this.name;
    }

    /**
     * getter email dari recruiter
     * @return email dari recruiter
     */
    public String getEmail(){
        return this.email;
    }

    /**
     * getter nomor telepon dari recruiter
     * @return phoneNumber dari recruiter
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
     * getter nomor telepon dari recruiter
     * @return phoneNumber dari recruiter
     */
    public Location getLocation(){
        return this.location;
    }

    /**
     * setter id dari recruiter
     * @param id dari recruiter
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * setter nama dari lokasi
     * @param name dari lokasi
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * setter email dari lokasi
     * @param email dari lokasi
     */
    public void setEmail(String email){
        this.email = email;
    }

    /**
     * setter nomor telepon dari lokasi
     * @param phoneNumber dari lokasi
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /**
     * setter lokasi dari class lokasi
     * @param location dari class lokasi
     */
    public void setLocation(Location location){
        this.location = location;
    }
}
