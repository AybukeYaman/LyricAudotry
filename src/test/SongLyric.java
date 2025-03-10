package test;

public class SongLyric {
    private int lyricID;
    private String name;
    private String currentStep;
    private String statusString;
    private boolean formalAuditingFlag;
    private OurLinkedList<String> auditors;
    private OurLinkedList<String> auditingHistory;

    public SongLyric(int lyricID, String name, boolean formalAuditingFlag) {
        this.lyricID = lyricID;
        this.name = name;
        this.formalAuditingFlag = formalAuditingFlag;
        this.statusString = "Awaiting Auditing";
        this.auditors = new OurLinkedList<>();
        this.auditingHistory = new OurLinkedList<>();
        this.currentStep = "Drafting";
    }

    public void addAuditor(String auditor) {
        auditors.add(auditor);
        System.out.println("Awaiting Auditing");
    }

    public boolean allAuditorsApproved() {
        for (int i = 0; i < auditors.size(); i++) { 
            
            if (!auditingHistory.get(i).contains("Approved")) {
                return false;
            }
        }
        return true;
    }

    public void addAuditing(String auditor, String auditing) {
        auditingHistory.add(auditor + ": " + auditing);
        if (auditing.equals("Approved")) {
            updateStatus("Approved by " + auditor);
        } else  {
            updateStatus("Rejected by " + auditor);
        }
    }

    public void updateStatus(String status) {
        this.statusString = status;
    }

    public int getLyricID() {
    	return lyricID; 
    	}
    public void setLyricID(int lyricID) {
    	this.lyricID = lyricID; }
    
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
    public void setStatuString(String statusString) {
    	this.statusString = statusString;
    	}
    public boolean isFormalAuditingFlag() {
    	return formalAuditingFlag;
    	}
    public void setFormalAuditingFlag(boolean formalAuditingFlag) {
    	this.formalAuditingFlag = formalAuditingFlag;
    	}
    
}
