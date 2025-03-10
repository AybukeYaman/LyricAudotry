package test;

public class AuditorStatus {
	private String auditorName;
	private String status;
	
	public AuditorStatus(String auditorName, String status) {
        this.auditorName = auditorName;
        this.status = status;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
