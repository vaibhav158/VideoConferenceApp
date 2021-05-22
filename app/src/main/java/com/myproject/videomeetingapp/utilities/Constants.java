package com.myproject.videomeetingapp.utilities;

import java.util.HashMap;

public class Constants {
    public static final String KEY_COLLECTION_USERS= "users";
    public static final String KEY_FIRST_NAME= "first_name";
    public static final String KEY_LAST_NAME ="last_name";
    public static final String KEY_EMAIL= "email";
    public static final String KEY_PASSWORD= "password";
    public static final String KEY_PREFERENCE_NAME= "videoMeetingPreference";
    public static final String KEY_IS_SIGNED_IN ="isSignedIn";
    public static final String KEY_USER_ID= "user_id";
    public static final String KEY_FCM_TOKEN= "fcm_token";

    public static final String REMOTE_MSG_AUTHORIZATION= "Authorization";
    public static final String REMOTE_MSG_CONTENT_TYPE ="Content-Type";
    public static final String REMOTE_MSG_TYPE= "type";
    public static final String REMOTE_MSG_INVITATION= "invitation";
    public static final String REMOTE_MSG_MEETING_TYPE= "meetingType";
    public static final String REMOTE_MSG_INVITER_TOKEN= "inviterToken";
    public static final String REMOTE_MSG_DATA ="data";
    public static final String REMOTE_MSG_REGISTRATION_IDS ="registration_ids";

    public static final String REMOTE_MSG_INVITATION_RESPONSE= "invitationResponse";
    public static final String REMOTE_MSG_INVITATION_ACCEPTED = "accepted";
    public static final String REMOTE_MSG_INVITATION_REJECTED = "rejected";
    public static final String REMOTE_MSG_INVITATION_CANCELLED = "cancelled";
    public static final String REMOTE_MSG_MEETING_ROOM= "meetingRoom";

    public static HashMap<String, String> getRemoteMessageHeaders(){
        HashMap<String, String> headers = new HashMap<>();
        headers.put(
                Constants.REMOTE_MSG_AUTHORIZATION,
                "key=AAAAqgx0Dco:APA91bHx3ebOOzJ9h3-a72s8BHithu7wq9l8QLD6K8kzJ7jUn2ts1hEPRLzZ28Z3tQ6-8n9eX_59WhpfuCF0Zq9SzgHmeb9mF1lPCO4LBxQF2tSvBgZ-TP6RJEM5ZkFpCbSqTjGp21Op"
        );
        headers.put(Constants.REMOTE_MSG_CONTENT_TYPE, "application/json");
        return headers;
    }
}
