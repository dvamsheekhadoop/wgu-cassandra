package com.cassandra.rest;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("stuinfo")
public class StudentInfo {

	
	@PrimaryKey("pidm")
	private  int pidm;

	@Column("studentid")
	private String studentid;

	@Column
	private String username;
	
	@Column
	private String aboutme;
	
	@Column
	private String city;
	
	@Column
	private String collegename;
	
	@Column
	private String country;
	
	@Column
	private String currentstudentstatus;
	
	@Column
	private String degreecode;
	
	@Column
	private String degreename;
	
	@Column
	private String firstname;
	
	@Column
	private int haspublicaboutme;
	
	@Column
	private int haspublicaddress;
	
	@Column
	private int haspubliccollege;
	@Column
	private int haspubliccountry;
	
	@Column
	private int haspubliccurrentcourses;
	
	@Column
	private int haspublicdirsearch;
	
	@Column
	private int haspublicfirstname;
	
	@Column
	private int haspublicgradyear;
	
	@Column
	private int haspublicmilitarystatus;
	
	@Column
	private int haspublicmobilephone;
	
	@Column
	private int haspublicpreferredemail;
	
	@Column
	private int haspublicprimaryphone;
	
	@Column
	private int haspublicsociallinks;
	
	@Column
	private int haspublicstatus;
	
	@Column
	private int haspubliczipcode;
	
	@Column
	private String homeareacode;
	
	@Column
	private String homephone;
	
	@Column
	private String homephonenumber;
	
	@Column
	private String homephonetype;
	
	@Column
	private int isactivemilitary;
	
	@Column
	private int isconfidential;
	
	@Column
	private int isdeceased;
	
	@Column
	private int isemployee;
	
	@Column
	private int isenrolledinewb;
	
	@Column
	private int isstudent;
	
	@Column
	private String lastcarestage;
	
	@Column
	private String lastname;
	
	@Column
	private String middlename;
	
	@Column
	private String mobileareacode;
	
	@Column
	private String mobilephone;
	
	@Column
	private String mobilephonenumber;
	
	@Column
	private String mobilephonetype;
	
	@Column
	private String officialfirstname;
	
	@Column
	private String persontype;
	
	@Column
	private String plannedgraduationdate;
	
	@Column
	private String preferredemail;
	
	@Column
	private String preferredfirstname;
	
	@Column
	private String primaryareacode;
	
	@Column
	private String primaryphone;
	
	@Column
	private String primaryphonenumber;
	
	@Column
	private String primaryphonetype;
	
	@Column
	private String profiletimezone;
	
	@Column
	private String prospectivestudentstartdate;
	
	@Column
	private String socialmedialinksjson;
	
	@Column
	private String state;
	
	@Column
	private String streetline1;
	
	@Column
	private String streetline2;
	
	@Column
	private String studentstatus;
	
	@Column
	private String wguemail;

	@Column(value = "zipcode")
	private String zipcode;

	/**
	 * Default Constructor
	 */
	public StudentInfo() {
		super();
	}

	public StudentInfo(int pidm, String studentid, String username, String aboutme, String city, String collegename,
			String country, String currentstudentstatus, String degreecode, String degreename, String firstname,
			int haspublicaboutme, int haspublicaddress, int haspubliccollege, int haspubliccountry,
			int haspubliccurrentcourses, int haspublicdirsearch, int haspublicfirstname, int haspublicgradyear,
			int haspublicmilitarystatus, int haspublicmobilephone, int haspublicpreferredemail,
			int haspublicprimaryphone, int haspublicsociallinks, int haspublicstatus, int haspubliczipcode,
			String homeareacode, String homephone, String homephonenumber, String homephonetype, int isactivemilitary,
			int isconfidential, int isdeceased, int isemployee, int isenrolledinewb, int isstudent,
			String lastcarestage, String lastname, String middlename, String mobileareacode, String mobilephone,
			String mobilephonenumber, String mobilephonetype, String officialfirstname, String persontype,
			String plannedgraduationdate, String preferredemail, String preferredfirstname, String primaryareacode,
			String primaryphone, String primaryphonenumber, String primaryphonetype, String profiletimezone,
			String prospectivestudentstartdate, String socialmedialinksjson, String state, String streetline1,
			String streetline2, String studentstatus, String wguemail, String zipcode) {
		super();
		this.pidm = pidm;
		this.studentid = studentid;
		this.username = username;
		this.aboutme = aboutme;
		this.city = city;
		this.collegename = collegename;
		this.country = country;
		this.currentstudentstatus = currentstudentstatus;
		this.degreecode = degreecode;
		this.degreename = degreename;
		this.firstname = firstname;
		this.haspublicaboutme = haspublicaboutme;
		this.haspublicaddress = haspublicaddress;
		this.haspubliccollege = haspubliccollege;
		this.haspubliccountry = haspubliccountry;
		this.haspubliccurrentcourses = haspubliccurrentcourses;
		this.haspublicdirsearch = haspublicdirsearch;
		this.haspublicfirstname = haspublicfirstname;
		this.haspublicgradyear = haspublicgradyear;
		this.haspublicmilitarystatus = haspublicmilitarystatus;
		this.haspublicmobilephone = haspublicmobilephone;
		this.haspublicpreferredemail = haspublicpreferredemail;
		this.haspublicprimaryphone = haspublicprimaryphone;
		this.haspublicsociallinks = haspublicsociallinks;
		this.haspublicstatus = haspublicstatus;
		this.haspubliczipcode = haspubliczipcode;
		this.homeareacode = homeareacode;
		this.homephone = homephone;
		this.homephonenumber = homephonenumber;
		this.homephonetype = homephonetype;
		this.isactivemilitary = isactivemilitary;
		this.isconfidential = isconfidential;
		this.isdeceased = isdeceased;
		this.isemployee = isemployee;
		this.isenrolledinewb = isenrolledinewb;
		this.isstudent = isstudent;
		this.lastcarestage = lastcarestage;
		this.lastname = lastname;
		this.middlename = middlename;
		this.mobileareacode = mobileareacode;
		this.mobilephone = mobilephone;
		this.mobilephonenumber = mobilephonenumber;
		this.mobilephonetype = mobilephonetype;
		this.officialfirstname = officialfirstname;
		this.persontype = persontype;
		this.plannedgraduationdate = plannedgraduationdate;
		this.preferredemail = preferredemail;
		this.preferredfirstname = preferredfirstname;
		this.primaryareacode = primaryareacode;
		this.primaryphone = primaryphone;
		this.primaryphonenumber = primaryphonenumber;
		this.primaryphonetype = primaryphonetype;
		this.profiletimezone = profiletimezone;
		this.prospectivestudentstartdate = prospectivestudentstartdate;
		this.socialmedialinksjson = socialmedialinksjson;
		this.state = state;
		this.streetline1 = streetline1;
		this.streetline2 = streetline2;
		this.studentstatus = studentstatus;
		this.wguemail = wguemail;
		this.zipcode = zipcode;
	}

	public int getPidm() {
		return pidm;
	}

	public void setPidm(int pidm) {
		this.pidm = pidm;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAboutme() {
		return aboutme;
	}

	public void setAboutme(String aboutme) {
		this.aboutme = aboutme;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrentstudentstatus() {
		return currentstudentstatus;
	}

	public void setCurrentstudentstatus(String currentstudentstatus) {
		this.currentstudentstatus = currentstudentstatus;
	}

	public String getDegreecode() {
		return degreecode;
	}

	public void setDegreecode(String degreecode) {
		this.degreecode = degreecode;
	}

	public String getDegreename() {
		return degreename;
	}

	public void setDegreename(String degreename) {
		this.degreename = degreename;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getHaspublicaboutme() {
		return haspublicaboutme;
	}

	public void setHaspublicaboutme(int haspublicaboutme) {
		this.haspublicaboutme = haspublicaboutme;
	}

	public int getHaspublicaddress() {
		return haspublicaddress;
	}

	public void setHaspublicaddress(int haspublicaddress) {
		this.haspublicaddress = haspublicaddress;
	}

	public int getHaspubliccollege() {
		return haspubliccollege;
	}

	public void setHaspubliccollege(int haspubliccollege) {
		this.haspubliccollege = haspubliccollege;
	}

	public int getHaspubliccountry() {
		return haspubliccountry;
	}

	public void setHaspubliccountry(int haspubliccountry) {
		this.haspubliccountry = haspubliccountry;
	}

	public int getHaspubliccurrentcourses() {
		return haspubliccurrentcourses;
	}

	public void setHaspubliccurrentcourses(int haspubliccurrentcourses) {
		this.haspubliccurrentcourses = haspubliccurrentcourses;
	}

	public int getHaspublicdirsearch() {
		return haspublicdirsearch;
	}

	public void setHaspublicdirsearch(int haspublicdirsearch) {
		this.haspublicdirsearch = haspublicdirsearch;
	}

	public int getHaspublicfirstname() {
		return haspublicfirstname;
	}

	public void setHaspublicfirstname(int haspublicfirstname) {
		this.haspublicfirstname = haspublicfirstname;
	}

	public int getHaspublicgradyear() {
		return haspublicgradyear;
	}

	public void setHaspublicgradyear(int haspublicgradyear) {
		this.haspublicgradyear = haspublicgradyear;
	}

	public int getHaspublicmilitarystatus() {
		return haspublicmilitarystatus;
	}

	public void setHaspublicmilitarystatus(int haspublicmilitarystatus) {
		this.haspublicmilitarystatus = haspublicmilitarystatus;
	}

	public int getHaspublicmobilephone() {
		return haspublicmobilephone;
	}

	public void setHaspublicmobilephone(int haspublicmobilephone) {
		this.haspublicmobilephone = haspublicmobilephone;
	}

	public int getHaspublicpreferredemail() {
		return haspublicpreferredemail;
	}

	public void setHaspublicpreferredemail(int haspublicpreferredemail) {
		this.haspublicpreferredemail = haspublicpreferredemail;
	}

	public int getHaspublicprimaryphone() {
		return haspublicprimaryphone;
	}

	public void setHaspublicprimaryphone(int haspublicprimaryphone) {
		this.haspublicprimaryphone = haspublicprimaryphone;
	}

	public int getHaspublicsociallinks() {
		return haspublicsociallinks;
	}

	public void setHaspublicsociallinks(int haspublicsociallinks) {
		this.haspublicsociallinks = haspublicsociallinks;
	}

	public int getHaspublicstatus() {
		return haspublicstatus;
	}

	public void setHaspublicstatus(int haspublicstatus) {
		this.haspublicstatus = haspublicstatus;
	}

	public int getHaspubliczipcode() {
		return haspubliczipcode;
	}

	public void setHaspubliczipcode(int haspubliczipcode) {
		this.haspubliczipcode = haspubliczipcode;
	}

	public String getHomeareacode() {
		return homeareacode;
	}

	public void setHomeareacode(String homeareacode) {
		this.homeareacode = homeareacode;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getHomephonenumber() {
		return homephonenumber;
	}

	public void setHomephonenumber(String homephonenumber) {
		this.homephonenumber = homephonenumber;
	}

	public String getHomephonetype() {
		return homephonetype;
	}

	public void setHomephonetype(String homephonetype) {
		this.homephonetype = homephonetype;
	}

	public int getIsactivemilitary() {
		return isactivemilitary;
	}

	public void setIsactivemilitary(int isactivemilitary) {
		this.isactivemilitary = isactivemilitary;
	}

	public int getIsconfidential() {
		return isconfidential;
	}

	public void setIsconfidential(int isconfidential) {
		this.isconfidential = isconfidential;
	}

	public int getIsdeceased() {
		return isdeceased;
	}

	public void setIsdeceased(int isdeceased) {
		this.isdeceased = isdeceased;
	}

	public int getIsemployee() {
		return isemployee;
	}

	public void setIsemployee(int isemployee) {
		this.isemployee = isemployee;
	}

	public int getIsenrolledinewb() {
		return isenrolledinewb;
	}

	public void setIsenrolledinewb(int isenrolledinewb) {
		this.isenrolledinewb = isenrolledinewb;
	}

	public int getIsstudent() {
		return isstudent;
	}

	public void setIsstudent(int isstudent) {
		this.isstudent = isstudent;
	}

	public String getLastcarestage() {
		return lastcarestage;
	}

	public void setLastcarestage(String lastcarestage) {
		this.lastcarestage = lastcarestage;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMobileareacode() {
		return mobileareacode;
	}

	public void setMobileareacode(String mobileareacode) {
		this.mobileareacode = mobileareacode;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getMobilephonenumber() {
		return mobilephonenumber;
	}

	public void setMobilephonenumber(String mobilephonenumber) {
		this.mobilephonenumber = mobilephonenumber;
	}

	public String getMobilephonetype() {
		return mobilephonetype;
	}

	public void setMobilephonetype(String mobilephonetype) {
		this.mobilephonetype = mobilephonetype;
	}

	public String getOfficialfirstname() {
		return officialfirstname;
	}

	public void setOfficialfirstname(String officialfirstname) {
		this.officialfirstname = officialfirstname;
	}

	public String getPersontype() {
		return persontype;
	}

	public void setPersontype(String persontype) {
		this.persontype = persontype;
	}

	public String getPlannedgraduationdate() {
		return plannedgraduationdate;
	}

	public void setPlannedgraduationdate(String plannedgraduationdate) {
		this.plannedgraduationdate = plannedgraduationdate;
	}

	public String getPreferredemail() {
		return preferredemail;
	}

	public void setPreferredemail(String preferredemail) {
		this.preferredemail = preferredemail;
	}

	public String getPreferredfirstname() {
		return preferredfirstname;
	}

	public void setPreferredfirstname(String preferredfirstname) {
		this.preferredfirstname = preferredfirstname;
	}

	public String getPrimaryareacode() {
		return primaryareacode;
	}

	public void setPrimaryareacode(String primaryareacode) {
		this.primaryareacode = primaryareacode;
	}

	public String getPrimaryphone() {
		return primaryphone;
	}

	public void setPrimaryphone(String primaryphone) {
		this.primaryphone = primaryphone;
	}

	public String getPrimaryphonenumber() {
		return primaryphonenumber;
	}

	public void setPrimaryphonenumber(String primaryphonenumber) {
		this.primaryphonenumber = primaryphonenumber;
	}

	public String getPrimaryphonetype() {
		return primaryphonetype;
	}

	public void setPrimaryphonetype(String primaryphonetype) {
		this.primaryphonetype = primaryphonetype;
	}

	public String getProfiletimezone() {
		return profiletimezone;
	}

	public void setProfiletimezone(String profiletimezone) {
		this.profiletimezone = profiletimezone;
	}

	public String getProspectivestudentstartdate() {
		return prospectivestudentstartdate;
	}

	public void setProspectivestudentstartdate(String prospectivestudentstartdate) {
		this.prospectivestudentstartdate = prospectivestudentstartdate;
	}

	public String getSocialmedialinksjson() {
		return socialmedialinksjson;
	}

	public void setSocialmedialinksjson(String socialmedialinksjson) {
		this.socialmedialinksjson = socialmedialinksjson;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetline1() {
		return streetline1;
	}

	public void setStreetline1(String streetline1) {
		this.streetline1 = streetline1;
	}

	public String getStreetline2() {
		return streetline2;
	}

	public void setStreetline2(String streetline2) {
		this.streetline2 = streetline2;
	}

	public String getStudentstatus() {
		return studentstatus;
	}

	public void setStudentstatus(String studentstatus) {
		this.studentstatus = studentstatus;
	}

	public String getWguemail() {
		return wguemail;
	}

	public void setWguemail(String wguemail) {
		this.wguemail = wguemail;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "StudentInfo [pidm=" + pidm + ", studentid=" + studentid + ", username=" + username + ", aboutme="
				+ aboutme + ", city=" + city + ", collegename=" + collegename + ", country=" + country
				+ ", currentstudentstatus=" + currentstudentstatus + ", degreecode=" + degreecode + ", degreename="
				+ degreename + ", firstname=" + firstname + ", haspublicaboutme=" + haspublicaboutme
				+ ", haspublicaddress=" + haspublicaddress + ", haspubliccollege=" + haspubliccollege
				+ ", haspubliccountry=" + haspubliccountry + ", haspubliccurrentcourses=" + haspubliccurrentcourses
				+ ", haspublicdirsearch=" + haspublicdirsearch + ", haspublicfirstname=" + haspublicfirstname
				+ ", haspublicgradyear=" + haspublicgradyear + ", haspublicmilitarystatus=" + haspublicmilitarystatus
				+ ", haspublicmobilephone=" + haspublicmobilephone + ", haspublicpreferredemail="
				+ haspublicpreferredemail + ", haspublicprimaryphone=" + haspublicprimaryphone
				+ ", haspublicsociallinks=" + haspublicsociallinks + ", haspublicstatus=" + haspublicstatus
				+ ", haspubliczipcode=" + haspubliczipcode + ", homeareacode=" + homeareacode + ", homephone="
				+ homephone + ", homephonenumber=" + homephonenumber + ", homephonetype=" + homephonetype
				+ ", isactivemilitary=" + isactivemilitary + ", isconfidential=" + isconfidential + ", isdeceased="
				+ isdeceased + ", isemployee=" + isemployee + ", isenrolledinewb=" + isenrolledinewb + ", isstudent="
				+ isstudent + ", lastcarestage=" + lastcarestage + ", lastname=" + lastname + ", middlename="
				+ middlename + ", mobileareacode=" + mobileareacode + ", mobilephone=" + mobilephone
				+ ", mobilephonenumber=" + mobilephonenumber + ", mobilephonetype=" + mobilephonetype
				+ ", officialfirstname=" + officialfirstname + ", persontype=" + persontype + ", plannedgraduationdate="
				+ plannedgraduationdate + ", preferredemail=" + preferredemail + ", preferredfirstname="
				+ preferredfirstname + ", primaryareacode=" + primaryareacode + ", primaryphone=" + primaryphone
				+ ", primaryphonenumber=" + primaryphonenumber + ", primaryphonetype=" + primaryphonetype
				+ ", profiletimezone=" + profiletimezone + ", prospectivestudentstartdate="
				+ prospectivestudentstartdate + ", socialmedialinksjson=" + socialmedialinksjson + ", state=" + state
				+ ", streetline1=" + streetline1 + ", streetline2=" + streetline2 + ", studentstatus=" + studentstatus
				+ ", wguemail=" + wguemail + ", zipcode=" + zipcode + "]";
	}
}
