package com.plivo.helper.api.response.carrier;

import com.google.gson.annotations.SerializedName;

public class OutgoingCarrierRoutingMeta {
    public String previous ;

    @SerializedName("total_count")
    public Integer totalCount ;
    
    public Integer offset ;
    
    public Integer limit ;
    
    public String next ;
    
    public OutgoingCarrierRoutingMeta() {
        // empty
    }

	@Override
	public String toString() {
		return "OutgoingCarrierRoutingMeta [previous=" + previous
				+ ", totalCount=" + totalCount + ", offset=" + offset
				+ ", limit=" + limit + ", next=" + next + "]";
	}

}