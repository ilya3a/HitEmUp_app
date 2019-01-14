package com.yoyo.hitemup;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Creature implements ICreature {
    private int valueOfCreature;
    private int ImgResId;
    private int life;
    private int id;

    public int getLife() {
        return life;
    }


    public int getId() {
        return id;
    }

    public Creature(int id, int valueOfCreature, int imgResId, int life) {
        this.valueOfCreature = valueOfCreature;
        this.ImgResId = imgResId;
        this.life = life;
        this.id=id;


    }

    public int getValueOfCreature() {
        return valueOfCreature;
    }


    public int getImgResId() {
        return ImgResId;
    }

    public void showCreature(ImageView view, Context context) {
//        view.setTag(id);
        Animation showAnim = AnimationUtils.loadAnimation(context, R.anim.show_monster);
        view.setImageResource(getImgResId());
        view.setVisibility(View.VISIBLE);
        view.setAnimation(showAnim);
        view.setEnabled(true);
    }

    public void deadCreature(ImageView view, Context context) {
        Animation hideAnim = AnimationUtils.loadAnimation(context, R.anim.hide_monster);
        view.setImageResource(R.drawable.bam);
        view.setAnimation(hideAnim);
        view.setEnabled(false);
        view.setVisibility(View.INVISIBLE);
    }

    public void hideCreature(ImageView view, Context context) {
        Animation hideAnim = AnimationUtils.loadAnimation(context, R.anim.hide_monster);
        view.setAnimation(hideAnim);
        view.setEnabled(false);
        view.setVisibility(View.INVISIBLE);
    }
}
