package Cmpe223HW;

public class SongLyric {
	private int lyricID;
	private String name;//şarkı sözlerinin adı
	private String currentStep;
	private String statusString;
	private boolean formalAuditingFlag;


	public SongLyric(int lyricID, String name, boolean formalAuditingFlag) {
		this.lyricID = lyricID;
		this.name = name;
		this.formalAuditingFlag = formalAuditingFlag;
	}
	

	public int getLyricID() {
		return lyricID;
	}


	public void setLyricID(int lyricID) {
		this.lyricID = lyricID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCurrentStep() {
		return currentStep;
	}


	public void setCurrentStep(String currentStep) {
		this.currentStep = currentStep;
	}


	public String getStatuString() {
		return statusString;
	}


	public void setStatuString(String statuString) {
		this.statusString = statuString;
	}


	public boolean isFormalAuditingFlag() {
		return formalAuditingFlag;
	}


	public void setFormalAuditingFlag(boolean formalAuditingFlag) {
		this.formalAuditingFlag = formalAuditingFlag;
	}

	
	

	public void addAuditor(String auditor) {

		System.out.println("Awaiting Auditing");
	}
	

}
