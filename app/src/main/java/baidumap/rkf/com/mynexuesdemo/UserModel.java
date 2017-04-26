package baidumap.rkf.com.mynexuesdemo;

/**
 * Created by rankaifeng on 2017/4/25.
 */

public class UserModel {
    public static final int TYPE_ONE=1;
    public static final int TYPE_TWO=2;
    public static final int TYPE_THREE=3;

    private String name;
    private String sex;
    private int type;
    private int backgroundImg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(int backgroundImg) {
        this.backgroundImg = backgroundImg;
    }
}
