package com.example.ecss.medicalmapper.chattingsystem.FireChatHelper;

import android.app.AlertDialog;
import android.content.Context;

import com.example.ecss.medicalmapper.R;

import java.util.Random;

/**
 * Created by samuel on 5/8/2017.
 */

public class ChatHelper {

    private static Random randomAvatarGenerator = new Random();
    private static final int NUMBER_OF_AVATAR = 3;

    /*Generate an avatar randomly*/
    public static int generateRandomAvatarForUser() {
        return randomAvatarGenerator.nextInt(NUMBER_OF_AVATAR);
    }

    /*Get avatar id*/

    public static int getDrawableAvatarId(int givenRandomAvatarId) {

        switch (givenRandomAvatarId) {

            case 0:
                return R.drawable.headshot_7;
           /* case 1:
                return R.mipmap.ic_avatar_green;
            case 2:
                return R.mipmap.ic_avatar_purple;*/
            default:
                return R.drawable.headshot_7;
        }
    }

    public static AlertDialog buildAlertDialog(String title, String message, boolean isCancelable, Context context) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message)
                .setTitle(title);

        if (isCancelable) {
            builder.setPositiveButton(android.R.string.ok, null);
        } else {
            builder.setCancelable(false);
        }
        return builder.create();
    }

}
