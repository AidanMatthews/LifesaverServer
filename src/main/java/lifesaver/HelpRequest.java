package lifesaver;

public class HelpRequest {
    private final long id;
    private final long userId;
    private final long notifyRadius;
    private final boolean call911;
    private final long emergencyReason;
    private final String otherInfo;
    private final double timestamp;
    private final double latitude;
    private final double longitude;

    public HelpRequest(long id, long userId, long notifyRadius, boolean call911, long emergencyReason, String otherInfo, double timestamp, double latitude, double longitude) {
        this.id = id;
        this.userId = userId;
        this.notifyRadius = notifyRadius;
        this.call911 = call911;
        this.emergencyReason = emergencyReason;
        this.otherInfo = otherInfo;
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public long getNotifyRadius() {
        return notifyRadius;
    }

    public boolean getCall911() {
        return call911;
    }

    public long getEmergencyReason() {
        return emergencyReason;
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
