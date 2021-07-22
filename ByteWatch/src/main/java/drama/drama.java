package drama;

public class drama {
	
	private int drama_num;
	private String drama_name;
	private String actor;
	private String country;
	private String genre;
	private String image;
	private String detail;
	private String platform;
	private String season;
	private int episode;
	private String trailer;
	
	public drama(int drama_num, String drama_name,String genre,String image) {
		this.drama_num=drama_num;
		this.drama_name=drama_name;
		this.genre=genre;
		this.image=image;
	}
	public drama(int drama_num, String drama_name, String actor, String country, String genre, 
			String image, String detail, String platform, String season,int episode, String trailer){
		
		this.drama_num=drama_num;
		this.drama_name=drama_name;
		this.actor=actor;
		this.country=country;
		this.genre=genre;
		this.image=image;
		this.detail=detail;
		this.platform=platform;
		this.season=season;
		this.episode=episode;
		this.trailer=trailer;
		
	}

	public int getDrama_num() {
		return drama_num;
	}

	public void setDrama_num(int drama_num) {
		this.drama_num = drama_num;
	}

	public String getDrama_name() {
		return drama_name;
	}

	public void setDrama_name(String drama_name) {
		this.drama_name = drama_name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public int getEpisode() {
		return episode;
	}

	public void setEpisode(int episode) {
		this.episode = episode;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
}


