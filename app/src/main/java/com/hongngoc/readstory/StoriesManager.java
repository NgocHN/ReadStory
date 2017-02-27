package com.hongngoc.readstory;

import java.util.ArrayList;

/**
 * Created by sida on 2/21/2017.
 */

public class StoriesManager {
    private ArrayList<Story> stories;

    public StoriesManager () {
        stories = new ArrayList<>();
        stories.add(new Story("Sưu tầm", "Ba lưỡi rìu", R.drawable.ic_3_luoi_riu));
        stories.add(new Story("Sưu tầm", "Cô đào hát với người học trò", R.drawable.ic_co_dao_hat));
        stories.add(new Story("Sưu tầm", "Thầy lang bất đắc dĩ", R.drawable.ic_thay_lang));
        stories.add(new Story("Sưu tầm", "Cây tre trăm đốt", R.drawable.ic_100));
        stories.add(new Story("Sưu tầm", "Sự tích hoa đại", R.drawable.ic_hoa_dai));
        stories.add(new Story("Sưu tầm", "Sự tích ông bình vôi", R.drawable.ic_o_binh_voi));
    }

    public ArrayList<Story> getStories() {
        return stories;
    }
}
