package com.example.rajiv.auditioning;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by rajiv on 7/9/2017.
 */

public class weather_forecast {
    private String proj_name,proj_type,proj_desc,role_desc,features,shooting_loc,aud_loc,valid_from,valid_to,contact_no;


    public weather_forecast()
    {

    }
    public void fill_dat(String data[]) {
        proj_name=data[0];
        proj_type=data[1];
        proj_desc=data[2];
        role_desc=data[3];
        features=data[4];
        shooting_loc=data[5];
        aud_loc=data[6];
        valid_from=data[7];
        valid_to=data[8];
        contact_no=data[9];

    }

    public String retproj_name()
    {
        return proj_name;
    }
    public String retproj_type()
    {
        return proj_type;
    }
    public String retproj_desc()
    {
        return proj_desc;
    }
    public String retrole_desc_name()
    {
        return role_desc;
    }
    public String retfeatures()
    {
        return features;
    }
    public String retshooting_loc()
    {
        return shooting_loc;
    }
    public String retaud_loc()
    {
        return aud_loc;
    }
    public String retvalid_from()
    {
        return valid_from;
    }
    public String retvalid_to()
    {
        return valid_to;
    }
    public String retcontact_no()
    {
        return contact_no;
    }


}
