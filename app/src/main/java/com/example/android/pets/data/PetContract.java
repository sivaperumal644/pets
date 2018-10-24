package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by siva on 6/10/18.
 */

public class PetContract {

    private PetContract(){ }

    public static final class PetEntry implements BaseColumns{
        public final static String TABLE_NAME = "pets";

        public final static String ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE = 2;
        public final static int GENDER_UNKNOWN = 0;
    }
}
