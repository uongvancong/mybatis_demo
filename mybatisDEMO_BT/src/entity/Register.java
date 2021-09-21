package entity;

public class Register {
	private int id;
	private String name;
	private int idstudent;
	private int idsubject;
	private String createdDate;

	public Register() {

	}

	public Register(String name, int idstudent, int idsubject, String createdDate) {
		super();
		this.name = name;
		this.idstudent = idstudent;
		this.idsubject = idsubject;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.idstudent + " " + this.idsubject + " " + this.createdDate + "\n";
	}

}
