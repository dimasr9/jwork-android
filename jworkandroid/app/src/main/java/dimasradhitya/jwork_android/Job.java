package dimasradhitya.jwork_android;

/**
 * Class yang menyimpan fungsi-fungsi Job
 *
 * @author Dimas Radhitya
 * @version 30 Juni 2021
 */
public class Job {
    private int id, fee;
    private String name, category;
    private Recruiter recruiter;

    /**
     * Constructor untuk object dari class Job
     * @param id id dari Job
     * @param name nama dari Jobb
     * @param recruiter objek recruiter dari class Recruiter
     * @param fee gaji dari Job
     * @param category kategori dari Job
     */
    public Job(int id, String name, Recruiter recruiter, int fee, String category)
    {
        // initialise instance variables
        this.id = id;
        this.name = name;
        this.recruiter = recruiter;
        this.fee = fee;
        this.category = category;
    }

    /**
     * getter id dari Job
     * @return id dari Job
     */
    public int getId()
    {
        return this.id;
    }

    /**
     * getter nama dari Job
     * @return name dari Job
     */
    public String getName(){
        return this.name;
    }

    /**
     * getter recruiter dari class Recruiter
     * @return recruiter dari class Recruiter
     */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }

    /**
     * getter fee dari Job
     * @return fee dari Job
     */
    public int getFee(){
        return this.fee;
    }

    /**
     * getter category dari Job
     * @return category dari Job
     */
    public String getCategory(){
        return this.category;
    }

    /**
     * setter id dari Job
     * @param id dari Job
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * setter name dari Job
     * @param name dari Job
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * setter recruiter menggunakan objek dari class Recruiter
     * @param recruiter dari Job
     */
    public void setRecruiter(Recruiter recruiter){
        this.recruiter = recruiter;
    }

    /**
     * setter fee dari Job
     * @param fee dari Job
     */
    public void setFee(int fee){
        this.fee = fee;
    }

    /**
     * setter category dari Job
     * @param category dari Job
     */
    public void setCategory(String category){
        this.category = category;
    }
}
