package com.chuck.code;

import java.util.List;

/**
 * Created by Administrator on 2017/6/7/007.
 */

public class Action1 {

    /**
     * currentPage : 1
     * pageSize : 10
     * totalPages : 1
     * totalResults : 6
     * orderProperty : null
     * orderType :  asc
     * pageRecord : [{"cfpuId":23,"cfpuName":"他们就路","cfpuPrice":500,"cfpuDesc":"投资图","cfpuPhone":"18654459287","cfpuContName":"咯哦路","cfpuDueTime":"1506873600000","cfpuImage":"020170602171702662.png","cfpuImageMore":"020170602171702662.png","cfpuCreateTime":"1496395236000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":4,"cfpuJoinPrice":4,"cfpuJoinEmail":"哦我考虑","cfpuMemberId":2228119480579969,"cfpeId":23,"cfpeFundId":23,"cfpeHospFront":"0201706021719422921.jpg","cfpeHospBack":"0201706021719482721.jpg","cfpeThirdFront":"020170602171952530.jpg","cfpeThirdBack":"0201706021719577492.jpg","cfpeGuarFront":"0201706021720036423.jpg","cfpeGuarBack":"0201706021720084818.jpg","cfpeIdentityFront":"0201706021719317409.jpg","cfpeIdentityBack":"0201706021719372120.jpg","cfpeLegislationFront":"0201706021720241877.jpg","cfpeLegislationBack":"0201706021720293740.jpg","cfpeImageMore":"0201706021720149131.jpg,0201706021720192981.jpg","cfpeFamily":"他我不想","cfpuMemberName":"饶生殿_6010"},{"cfpuId":15,"cfpuName":"测试公益","cfpuPrice":5100,"cfpuDesc":"测试 的","cfpuPhone":"13452814788","cfpuContName":"赵四","cfpuDueTime":"1495900800000","cfpuImage":"","cfpuImageMore":null,"cfpuCreateTime":"1495850560000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":1,"cfpuJoinPrice":1000,"cfpuJoinEmail":"962635255@qq.com","cfpuMemberId":null,"cfpeId":15,"cfpeFundId":15,"cfpeHospFront":"","cfpeHospBack":"","cfpeThirdFront":"","cfpeThirdBack":"","cfpeGuarFront":"","cfpeGuarBack":"","cfpeIdentityFront":"","cfpeIdentityBack":"","cfpeLegislationFront":"","cfpeLegislationBack":"","cfpeImageMore":",","cfpeFamily":"","cfpuMemberName":null},{"cfpuId":11,"cfpuName":"asdfsa","cfpuPrice":10,"cfpuDesc":"asfdas","cfpuPhone":"13452564851","cfpuContName":"asdfas","cfpuDueTime":"1495641600000","cfpuImage":"","cfpuImageMore":null,"cfpuCreateTime":"1494844320000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":2,"cfpuJoinPrice":101,"cfpuJoinEmail":"ad@qq.com","cfpuMemberId":null,"cfpeId":11,"cfpeFundId":11,"cfpeHospFront":"","cfpeHospBack":"","cfpeThirdFront":"","cfpeThirdBack":"","cfpeGuarFront":"","cfpeGuarBack":"","cfpeIdentityFront":"","cfpeIdentityBack":"","cfpeLegislationFront":"","cfpeLegislationBack":"","cfpeImageMore":",","cfpeFamily":"","cfpuMemberName":null},{"cfpuId":9,"cfpuName":"明天","cfpuPrice":3333,"cfpuDesc":"就如同去","cfpuPhone":"15922334455","cfpuContName":"哄哄","cfpuDueTime":"1494950400000","cfpuImage":"0201705121258363225.jpg","cfpuImageMore":"0201705121258363225.jpg","cfpuCreateTime":"1494565261000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":4,"cfpuJoinPrice":116,"cfpuJoinEmail":null,"cfpuMemberId":23296038583218152,"cfpeId":9,"cfpeFundId":9,"cfpeHospFront":"0201705121259325124.jpg","cfpeHospBack":"0201705121259435973.jpg","cfpeThirdFront":"0201705121259541021.jpg","cfpeThirdBack":"0201705121259593000.jpg","cfpeGuarFront":"0201705121300084432.jpg","cfpeGuarBack":"0201705121300309430.jpg","cfpeIdentityFront":"0201705121300449717.jpg","cfpeIdentityBack":"0201705121300491046.jpg","cfpeLegislationFront":"0201705121300201611.jpg","cfpeLegislationBack":"0201705121300572428.jpg","cfpeImageMore":"0201705121300147377.jpg,020170512130036120.jpg","cfpeFamily":"xhxh","cfpuMemberName":"形形色色的"},{"cfpuId":5,"cfpuName":"回家看看","cfpuPrice":569,"cfpuDesc":"归根结底就看见","cfpuPhone":"18008098135","cfpuContName":"白白嫩嫩","cfpuDueTime":"1491926400000","cfpuImage":"0201704101237371659.jpg","cfpuImageMore":"0201704101237371659.jpg","cfpuCreateTime":"1491799197000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":6,"cfpuJoinPrice":1402,"cfpuJoinEmail":null,"cfpuMemberId":22024317123857816,"cfpeId":5,"cfpeFundId":5,"cfpeHospFront":"0201704101238479997.jpg","cfpeHospBack":"0201704101238521511.jpg","cfpeThirdFront":"0201704101238599613.jpg","cfpeThirdBack":"0201704101239052867.jpg","cfpeGuarFront":"020170410123911363.jpg","cfpeGuarBack":"020170410123917749.jpg","cfpeIdentityFront":"0201704101238345626.jpg","cfpeIdentityBack":"0201704101238414897.jpg","cfpeLegislationFront":"0201704101239401993.jpg","cfpeLegislationBack":"0201704101239479458.jpg","cfpeImageMore":"0201704101239248159.jpg,0201704101239303676.jpg","cfpeFamily":"吃VB那你看哭了","cfpuMemberName":"杨志刚"},{"cfpuId":2,"cfpuName":"点亮非洲之行","cfpuPrice":5120,"cfpuDesc":"为非洲困难群众献出一份爱心","cfpuPhone":"15946521475","cfpuContName":"刘永好","cfpuDueTime":"1521043200000","cfpuImage":"020170323154913762.png","cfpuImageMore":"0201703231549179640.png,0201703231549207591.png","cfpuCreateTime":"1490255404000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":20,"cfpuJoinPrice":3061.33,"cfpuJoinEmail":null,"cfpuMemberId":null,"cfpeId":2,"cfpeFundId":2,"cfpeHospFront":"0201703231549318679.png","cfpeHospBack":"0201703231549357155.png","cfpeThirdFront":"0201703231549388789.png","cfpeThirdBack":"0201703231549408446.png","cfpeGuarFront":"0201703231549431398.png","cfpeGuarBack":"0201703231549462500.png","cfpeIdentityFront":"0201703231549268543.png","cfpeIdentityBack":"0201703231549288766.png","cfpeLegislationFront":"0201703231549544053.png","cfpeLegislationBack":"0201703231549577307.png","cfpeImageMore":"0201703231549498097.png,0201703231549529260.png","cfpeFamily":"非洲","cfpuMemberName":null}]
     * getPropertyMethods : null
     */

    private ResultBean result;
    /**
     * result : {"currentPage":1,"pageSize":10,"totalPages":1,"totalResults":6,"orderProperty":null,"orderType":" asc ","pageRecord":[{"cfpuId":23,"cfpuName":"他们就路","cfpuPrice":500,"cfpuDesc":"投资图","cfpuPhone":"18654459287","cfpuContName":"咯哦路","cfpuDueTime":"1506873600000","cfpuImage":"020170602171702662.png","cfpuImageMore":"020170602171702662.png","cfpuCreateTime":"1496395236000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":4,"cfpuJoinPrice":4,"cfpuJoinEmail":"哦我考虑","cfpuMemberId":2228119480579969,"cfpeId":23,"cfpeFundId":23,"cfpeHospFront":"0201706021719422921.jpg","cfpeHospBack":"0201706021719482721.jpg","cfpeThirdFront":"020170602171952530.jpg","cfpeThirdBack":"0201706021719577492.jpg","cfpeGuarFront":"0201706021720036423.jpg","cfpeGuarBack":"0201706021720084818.jpg","cfpeIdentityFront":"0201706021719317409.jpg","cfpeIdentityBack":"0201706021719372120.jpg","cfpeLegislationFront":"0201706021720241877.jpg","cfpeLegislationBack":"0201706021720293740.jpg","cfpeImageMore":"0201706021720149131.jpg,0201706021720192981.jpg","cfpeFamily":"他我不想","cfpuMemberName":"饶生殿_6010"},{"cfpuId":15,"cfpuName":"测试公益","cfpuPrice":5100,"cfpuDesc":"测试 的","cfpuPhone":"13452814788","cfpuContName":"赵四","cfpuDueTime":"1495900800000","cfpuImage":"","cfpuImageMore":null,"cfpuCreateTime":"1495850560000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":1,"cfpuJoinPrice":1000,"cfpuJoinEmail":"962635255@qq.com","cfpuMemberId":null,"cfpeId":15,"cfpeFundId":15,"cfpeHospFront":"","cfpeHospBack":"","cfpeThirdFront":"","cfpeThirdBack":"","cfpeGuarFront":"","cfpeGuarBack":"","cfpeIdentityFront":"","cfpeIdentityBack":"","cfpeLegislationFront":"","cfpeLegislationBack":"","cfpeImageMore":",","cfpeFamily":"","cfpuMemberName":null},{"cfpuId":11,"cfpuName":"asdfsa","cfpuPrice":10,"cfpuDesc":"asfdas","cfpuPhone":"13452564851","cfpuContName":"asdfas","cfpuDueTime":"1495641600000","cfpuImage":"","cfpuImageMore":null,"cfpuCreateTime":"1494844320000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":2,"cfpuJoinPrice":101,"cfpuJoinEmail":"ad@qq.com","cfpuMemberId":null,"cfpeId":11,"cfpeFundId":11,"cfpeHospFront":"","cfpeHospBack":"","cfpeThirdFront":"","cfpeThirdBack":"","cfpeGuarFront":"","cfpeGuarBack":"","cfpeIdentityFront":"","cfpeIdentityBack":"","cfpeLegislationFront":"","cfpeLegislationBack":"","cfpeImageMore":",","cfpeFamily":"","cfpuMemberName":null},{"cfpuId":9,"cfpuName":"明天","cfpuPrice":3333,"cfpuDesc":"就如同去","cfpuPhone":"15922334455","cfpuContName":"哄哄","cfpuDueTime":"1494950400000","cfpuImage":"0201705121258363225.jpg","cfpuImageMore":"0201705121258363225.jpg","cfpuCreateTime":"1494565261000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":4,"cfpuJoinPrice":116,"cfpuJoinEmail":null,"cfpuMemberId":23296038583218152,"cfpeId":9,"cfpeFundId":9,"cfpeHospFront":"0201705121259325124.jpg","cfpeHospBack":"0201705121259435973.jpg","cfpeThirdFront":"0201705121259541021.jpg","cfpeThirdBack":"0201705121259593000.jpg","cfpeGuarFront":"0201705121300084432.jpg","cfpeGuarBack":"0201705121300309430.jpg","cfpeIdentityFront":"0201705121300449717.jpg","cfpeIdentityBack":"0201705121300491046.jpg","cfpeLegislationFront":"0201705121300201611.jpg","cfpeLegislationBack":"0201705121300572428.jpg","cfpeImageMore":"0201705121300147377.jpg,020170512130036120.jpg","cfpeFamily":"xhxh","cfpuMemberName":"形形色色的"},{"cfpuId":5,"cfpuName":"回家看看","cfpuPrice":569,"cfpuDesc":"归根结底就看见","cfpuPhone":"18008098135","cfpuContName":"白白嫩嫩","cfpuDueTime":"1491926400000","cfpuImage":"0201704101237371659.jpg","cfpuImageMore":"0201704101237371659.jpg","cfpuCreateTime":"1491799197000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":6,"cfpuJoinPrice":1402,"cfpuJoinEmail":null,"cfpuMemberId":22024317123857816,"cfpeId":5,"cfpeFundId":5,"cfpeHospFront":"0201704101238479997.jpg","cfpeHospBack":"0201704101238521511.jpg","cfpeThirdFront":"0201704101238599613.jpg","cfpeThirdBack":"0201704101239052867.jpg","cfpeGuarFront":"020170410123911363.jpg","cfpeGuarBack":"020170410123917749.jpg","cfpeIdentityFront":"0201704101238345626.jpg","cfpeIdentityBack":"0201704101238414897.jpg","cfpeLegislationFront":"0201704101239401993.jpg","cfpeLegislationBack":"0201704101239479458.jpg","cfpeImageMore":"0201704101239248159.jpg,0201704101239303676.jpg","cfpeFamily":"吃VB那你看哭了","cfpuMemberName":"杨志刚"},{"cfpuId":2,"cfpuName":"点亮非洲之行","cfpuPrice":5120,"cfpuDesc":"为非洲困难群众献出一份爱心","cfpuPhone":"15946521475","cfpuContName":"刘永好","cfpuDueTime":"1521043200000","cfpuImage":"020170323154913762.png","cfpuImageMore":"0201703231549179640.png,0201703231549207591.png","cfpuCreateTime":"1490255404000","cfpuStatus":1,"cfpuType":1,"cfpuJoinNum":20,"cfpuJoinPrice":3061.33,"cfpuJoinEmail":null,"cfpuMemberId":null,"cfpeId":2,"cfpeFundId":2,"cfpeHospFront":"0201703231549318679.png","cfpeHospBack":"0201703231549357155.png","cfpeThirdFront":"0201703231549388789.png","cfpeThirdBack":"0201703231549408446.png","cfpeGuarFront":"0201703231549431398.png","cfpeGuarBack":"0201703231549462500.png","cfpeIdentityFront":"0201703231549268543.png","cfpeIdentityBack":"0201703231549288766.png","cfpeLegislationFront":"0201703231549544053.png","cfpeLegislationBack":"0201703231549577307.png","cfpeImageMore":"0201703231549498097.png,0201703231549529260.png","cfpeFamily":"非洲","cfpuMemberName":null}],"getPropertyMethods":null}
     * httpStatus : 200
     * type : 1
     * msg : 查询成功
     */

    private String httpStatus;
    private String type;
    private String msg;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class ResultBean {
//        private String currentPage;
        private String pageSize;
        private String totalPages;
        private String totalResults;
        private String orderProperty;
        private String orderType;
        private String getPropertyMethods;
        /**
         * cfpuId : 23
         * cfpuName : 他们就路
         * cfpuPrice : 500
         * cfpuDesc : 投资图
         * cfpuPhone : 18654459287
         * cfpuContName : 咯哦路
         * cfpuDueTime : 1506873600000
         * cfpuImage : 020170602171702662.png
         * cfpuImageMore : 020170602171702662.png
         * cfpuCreateTime : 1496395236000
         * cfpuStatus : 1
         * cfpuType : 1
         * cfpuJoinNum : 4
         * cfpuJoinPrice : 4
         * cfpuJoinEmail : 哦我考虑
         * cfpuMemberId : 2228119480579969
         * cfpeId : 23
         * cfpeFundId : 23
         * cfpeHospFront : 0201706021719422921.jpg
         * cfpeHospBack : 0201706021719482721.jpg
         * cfpeThirdFront : 020170602171952530.jpg
         * cfpeThirdBack : 0201706021719577492.jpg
         * cfpeGuarFront : 0201706021720036423.jpg
         * cfpeGuarBack : 0201706021720084818.jpg
         * cfpeIdentityFront : 0201706021719317409.jpg
         * cfpeIdentityBack : 0201706021719372120.jpg
         * cfpeLegislationFront : 0201706021720241877.jpg
         * cfpeLegislationBack : 0201706021720293740.jpg
         * cfpeImageMore : 0201706021720149131.jpg,0201706021720192981.jpg
         * cfpeFamily : 他我不想
         * cfpuMemberName : 饶生殿_6010
         */

        private List<PageRecordBean> pageRecord;

//        public String getCurrentPage() {
//            return currentPage;
//        }
//
//        public void setCurrentPage(String currentPage) {
//            this.currentPage = currentPage;
//        }

        public String getPageSize() {
            return pageSize;
        }

        public void setPageSize(String pageSize) {
            this.pageSize = pageSize;
        }

        public String getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(String totalPages) {
            this.totalPages = totalPages;
        }

        public String getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(String totalResults) {
            this.totalResults = totalResults;
        }

        public String getOrderProperty() {
            return orderProperty;
        }

        public void setOrderProperty(String orderProperty) {
            this.orderProperty = orderProperty;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getGetPropertyMethods() {
            return getPropertyMethods;
        }

        public void setGetPropertyMethods(String getPropertyMethods) {
            this.getPropertyMethods = getPropertyMethods;
        }

        public List<PageRecordBean> getPageRecord() {
            return pageRecord;
        }

        public void setPageRecord(List<PageRecordBean> pageRecord) {
            this.pageRecord = pageRecord;
        }

        public static class PageRecordBean {
            private String cfpuId;
            private String cfpuName;
            private String cfpuPrice;
            private String cfpuDesc;
            private String cfpuPhone;
            private String cfpuContName;
            private String cfpuDueTime;
            private String cfpuImage;
            private String cfpuImageMore;
            private String cfpuCreateTime;
            private String cfpuStatus;
            private String cfpuType;
            private String cfpuJoinNum;
            private String cfpuJoinPrice;
            private String cfpuJoinEmail;
            private String cfpuMemberId;
            private String cfpeId;
            private String cfpeFundId;
            private String cfpeHospFront;
            private String cfpeHospBack;
            private String cfpeThirdFront;
            private String cfpeThirdBack;
            private String cfpeGuarFront;
            private String cfpeGuarBack;
            private String cfpeIdentityFront;
            private String cfpeIdentityBack;
            private String cfpeLegislationFront;
            private String cfpeLegislationBack;
            private String cfpeImageMore;
            private String cfpeFamily;
            private String cfpuMemberName;

            public String getCfpuId() {
                return cfpuId;
            }

            public void setCfpuId(String cfpuId) {
                this.cfpuId = cfpuId;
            }

            public String getCfpuName() {
                return cfpuName;
            }

            public void setCfpuName(String cfpuName) {
                this.cfpuName = cfpuName;
            }

            public String getCfpuPrice() {
                return cfpuPrice;
            }

            public void setCfpuPrice(String cfpuPrice) {
                this.cfpuPrice = cfpuPrice;
            }

            public String getCfpuDesc() {
                return cfpuDesc;
            }

            public void setCfpuDesc(String cfpuDesc) {
                this.cfpuDesc = cfpuDesc;
            }

            public String getCfpuPhone() {
                return cfpuPhone;
            }

            public void setCfpuPhone(String cfpuPhone) {
                this.cfpuPhone = cfpuPhone;
            }

            public String getCfpuContName() {
                return cfpuContName;
            }

            public void setCfpuContName(String cfpuContName) {
                this.cfpuContName = cfpuContName;
            }

            public String getCfpuDueTime() {
                return cfpuDueTime;
            }

            public void setCfpuDueTime(String cfpuDueTime) {
                this.cfpuDueTime = cfpuDueTime;
            }

            public String getCfpuImage() {
                return cfpuImage;
            }

            public void setCfpuImage(String cfpuImage) {
                this.cfpuImage = cfpuImage;
            }

            public String getCfpuImageMore() {
                return cfpuImageMore;
            }

            public void setCfpuImageMore(String cfpuImageMore) {
                this.cfpuImageMore = cfpuImageMore;
            }

            public String getCfpuCreateTime() {
                return cfpuCreateTime;
            }

            public void setCfpuCreateTime(String cfpuCreateTime) {
                this.cfpuCreateTime = cfpuCreateTime;
            }

            public String getCfpuStatus() {
                return cfpuStatus;
            }

            public void setCfpuStatus(String cfpuStatus) {
                this.cfpuStatus = cfpuStatus;
            }

            public String getCfpuType() {
                return cfpuType;
            }

            public void setCfpuType(String cfpuType) {
                this.cfpuType = cfpuType;
            }

            public String getCfpuJoinNum() {
                return cfpuJoinNum;
            }

            public void setCfpuJoinNum(String cfpuJoinNum) {
                this.cfpuJoinNum = cfpuJoinNum;
            }

            public String getCfpuJoinPrice() {
                return cfpuJoinPrice;
            }

            public void setCfpuJoinPrice(String cfpuJoinPrice) {
                this.cfpuJoinPrice = cfpuJoinPrice;
            }

            public String getCfpuJoinEmail() {
                return cfpuJoinEmail;
            }

            public void setCfpuJoinEmail(String cfpuJoinEmail) {
                this.cfpuJoinEmail = cfpuJoinEmail;
            }

            public String getCfpuMemberId() {
                return cfpuMemberId;
            }

            public void setCfpuMemberId(String cfpuMemberId) {
                this.cfpuMemberId = cfpuMemberId;
            }

            public String getCfpeId() {
                return cfpeId;
            }

            public void setCfpeId(String cfpeId) {
                this.cfpeId = cfpeId;
            }

            public String getCfpeFundId() {
                return cfpeFundId;
            }

            public void setCfpeFundId(String cfpeFundId) {
                this.cfpeFundId = cfpeFundId;
            }

            public String getCfpeHospFront() {
                return cfpeHospFront;
            }

            public void setCfpeHospFront(String cfpeHospFront) {
                this.cfpeHospFront = cfpeHospFront;
            }

            public String getCfpeHospBack() {
                return cfpeHospBack;
            }

            public void setCfpeHospBack(String cfpeHospBack) {
                this.cfpeHospBack = cfpeHospBack;
            }

            public String getCfpeThirdFront() {
                return cfpeThirdFront;
            }

            public void setCfpeThirdFront(String cfpeThirdFront) {
                this.cfpeThirdFront = cfpeThirdFront;
            }

            public String getCfpeThirdBack() {
                return cfpeThirdBack;
            }

            public void setCfpeThirdBack(String cfpeThirdBack) {
                this.cfpeThirdBack = cfpeThirdBack;
            }

            public String getCfpeGuarFront() {
                return cfpeGuarFront;
            }

            public void setCfpeGuarFront(String cfpeGuarFront) {
                this.cfpeGuarFront = cfpeGuarFront;
            }

            public String getCfpeGuarBack() {
                return cfpeGuarBack;
            }

            public void setCfpeGuarBack(String cfpeGuarBack) {
                this.cfpeGuarBack = cfpeGuarBack;
            }

            public String getCfpeIdentityFront() {
                return cfpeIdentityFront;
            }

            public void setCfpeIdentityFront(String cfpeIdentityFront) {
                this.cfpeIdentityFront = cfpeIdentityFront;
            }

            public String getCfpeIdentityBack() {
                return cfpeIdentityBack;
            }

            public void setCfpeIdentityBack(String cfpeIdentityBack) {
                this.cfpeIdentityBack = cfpeIdentityBack;
            }

            public String getCfpeLegislationFront() {
                return cfpeLegislationFront;
            }

            public void setCfpeLegislationFront(String cfpeLegislationFront) {
                this.cfpeLegislationFront = cfpeLegislationFront;
            }

            public String getCfpeLegislationBack() {
                return cfpeLegislationBack;
            }

            public void setCfpeLegislationBack(String cfpeLegislationBack) {
                this.cfpeLegislationBack = cfpeLegislationBack;
            }

            public String getCfpeImageMore() {
                return cfpeImageMore;
            }

            public void setCfpeImageMore(String cfpeImageMore) {
                this.cfpeImageMore = cfpeImageMore;
            }

            public String getCfpeFamily() {
                return cfpeFamily;
            }

            public void setCfpeFamily(String cfpeFamily) {
                this.cfpeFamily = cfpeFamily;
            }

            public String getCfpuMemberName() {
                return cfpuMemberName;
            }

            public void setCfpuMemberName(String cfpuMemberName) {
                this.cfpuMemberName = cfpuMemberName;
            }
        }
    }
}
