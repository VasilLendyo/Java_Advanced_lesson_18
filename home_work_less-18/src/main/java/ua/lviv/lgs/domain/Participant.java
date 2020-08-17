package ua.lviv.lgs.domain;

public class Participant {

	private Integer id;
	private String name;
	private String email;
	private String level;
	private String primarySkill;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPrimarySkill() {
		return primarySkill;
	}
	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}
	@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", email=" + email + ", level=" + level + ", primarySkill="
				+ primarySkill + "]";
	}
}
