package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by drakesmith on 14/01/2018.
 */

public class BitCoinDataModel {

    // TODO: Declare the member variables here
    private String mMoney;


    // TODO: Create a BitCoinDataModel from a JSON:
    public static BitCoinDataModel fromJson(JSONObject jsonObject){
        BitCoinDataModel BitCoinDataModel = new BitCoinDataModel();

        try {
            BitCoinDataModel moneyData = new BitCoinDataModel();

            moneyData.mMoney = jsonObject.getString("volume_percent");
            //moneyData.mCondition = jsonObject.getJSONArray("weather")
              //      .getJSONObject(0).getInt("id");
            

            return moneyData;

        }catch (JSONException e){
            e.printStackTrace();
            return null;
        }

    }


    public String getmMoney() {
        return mMoney;
    }
    
}
