package dongting.bwei.com.dongting1503d20170619.bean;

import java.util.List;

/**
 * 作者:${董婷}
 * 日期:2017/6/19
 * 描述:定义实体类
 */

public class Bean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"妻：想当年我的身材和体形正面山清水秀，侧面悬崖峭壁，背面柳暗花明，是吧？夫：是呀，可惜水土保持做的太差了。","hashId":"49288A771A24A65AF795FC64E3B783CE","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"老婆给我说：\u201c是谁说的\u2018你的是我的，我的还是我的？\u2019这简直是藐视家庭和谐。亲爱的，请放心，在咱家，没有武则天，也没有慈禧太后，我俩永远都是平等的：家务事是你的，电视遥控器是我的；贷款卡是你的，工资卡是要交给我的\u2026\u2026\u201d","hashId":"0FFF07ED3922006BD755E88BB69EF58B","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"老婆：\u201c如果我死了，你会娶别人么？\u201d老公：\u201c你怎么可能死呢，如果你死了，我就为你守寡！\u201d老婆：\u201c鬼才信你呢。\u201d老公：\u201c鬼都信了，你还不信啊？\u201d","hashId":"F248CE2DF4C23124D2D41634B09D3106","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"男：\u201c咱们相处快三年了，岁数都不小了，应该商量一下结婚的时间了。\u201d女：\u201c你母亲的病最近怎样啦？\u201d男：\u201c越来越加重了，我每天除了照顾妈妈外，里里外外都是我一个人，结婚后你可以助我一臂之力。\u201d女：\u201c这么说，她活不长了？\u201d男：\u201c医生说顶多一年。\u201d女：\u201c那好，我们结婚的事，一年以后再说吧。\u201d","hashId":"4CBC2A71B994E6B062947519922F9DE3","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"看见公园的老榕树上用刀刻着的那句熟悉的\u201c永不分开\u201d，我转向妻子：\u201c老婆，你还记得这吗？\u201d妻子面带微笑：\u201c当然记得，当年你刻下的。\u201d我难抑心中甜蜜：\u201c这么多年啦，我们果真没有分开。\u201d妻子低下头，思绪仿佛也回到了多年前：\u201c是啊，当时知道你连出门约会都带着刀，谁特么敢分啊？\u201d","hashId":"10AD4386B27A80DB1A71DF1F370D8BF9","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"记得几年前，我陪着老爸一起看世界杯，看NBA。老爸自豪的说:\u201c以后谁娶了我闺女，多幸福，能有老婆陪着看球赛\u201d如今，当我一个人半夜对着电视等看欧洲杯，旁边是睡的香甜的老公。我只想流泪告诉老爸:\u201c爸，老公我找了，可是他不看球，还拒绝陪我看球啊。\u201d","hashId":"A10EEB1B7D200CABB37E8BFAB2F295A4","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"丈夫：今天是我们的结婚纪念日，当时的一切就好像在眼前，你还和当年一样，一点没变。妻子：当然，10年来我就一直穿着这件衣服呀！","hashId":"434299302547C1A3F20FAF2884262498","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"和老公一起去泡温泉，大家都穿泳衣。一对情侣从我们身边走过，男的看了我一眼。我对老公撒娇说：那个男的看我怎么办？老公得意的笑着说：没事，我也看他老婆了，我赚了\u2026\u2026","hashId":"89EF2A89906B52772F0D582291CD653A","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"妻子：\u201c说实话，这条裤子我穿上去是不是显得屁股太大了?\u201d丈夫：\u201c那我就说实话了啊，我觉得是你的屁股让这条裤子显得太大了。\u201d","hashId":"109E2AD01282E925982AA991775AE6D8","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"},{"content":"早晨坐公交车时，忍不住打了个喷嚏，就听后座一女人娇滴滴的说：\u201c老公，听说最近甲流感很严重呢，好害怕奥~\u201d。。。然后那男人说：\u201c怕啥，人流咱都不怕还怕甲流？。。。\u201d","hashId":"1DEAAF68CA4C7C6A0E0D2A70D217AB80","unixtime":1418745238,"updatetime":"2014-12-16 23:53:58"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 妻：想当年我的身材和体形正面山清水秀，侧面悬崖峭壁，背面柳暗花明，是吧？夫：是呀，可惜水土保持做的太差了。
             * hashId : 49288A771A24A65AF795FC64E3B783CE
             * unixtime : 1418745238
             * updatetime : 2014-12-16 23:53:58
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
