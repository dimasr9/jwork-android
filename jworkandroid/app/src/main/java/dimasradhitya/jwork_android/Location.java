package dimasradhitya.jwork_android;

/**
 * Class yang menyimpan fungsi-fungsi Location
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class Location {
    private String province, city, description;

    /**
     * Constructor untuk object dari class Location
     * @param province provinsi dari lokasi
     * @param city kota dari lokasi
     * @param description deskripsi dari lokasi
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * getter province dari lokasi
     * @return province dari lokasi
     */
    public String getProvince()
    {
        return this.province;
    }

    /**
     * getter city dari lokasi
     * @return city dari lokasi
     */
    public String getCity()
    {
        return this.city;
    }

    /**
     * getter description dari lokasi
     * @return description dari lokasi
     */
    public String getDescription()
    {
        return this.description;
    }

    /**
     * setter provinve dari lokasi
     * @param province dari lokasi
     */
    public void setProvince(String province)
    {
        this.province = province;
    }

    /**
     * setter city dari lokasi
     * @param city dari lokasi
     */
    public void setCity(String city)
    {
        this.city = city;
    }

    /**
     * setter description dari lokasi
     * @param description dari lokasi
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

}
