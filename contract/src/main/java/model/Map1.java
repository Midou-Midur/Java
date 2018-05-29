package model;

public class Map1 {
	  private final int id;


	    private String    name;

	    public Map1(final int id, final String name) {
	        super();
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return this.id;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public void setName(final String name) {
	        this.name = name;
	    }


}
