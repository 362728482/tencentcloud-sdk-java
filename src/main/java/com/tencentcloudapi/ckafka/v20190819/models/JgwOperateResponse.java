/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JgwOperateResponse extends AbstractModel{

    /**
    * 返回的code，0为正常，非0为错误
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * 成功消息
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
     * Get 返回的code，0为正常，非0为错误 
     * @return ReturnCode 返回的code，0为正常，非0为错误
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回的code，0为正常，非0为错误
     * @param ReturnCode 返回的code，0为正常，非0为错误
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 成功消息 
     * @return ReturnMessage 成功消息
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set 成功消息
     * @param ReturnMessage 成功消息
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);

    }
}
