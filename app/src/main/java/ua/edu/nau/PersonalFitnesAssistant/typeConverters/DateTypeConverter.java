package ua.edu.nau.PersonalFitnesAssistant.typeConverters;

import androidx.room.TypeConverter;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class DateTypeConverter {
    private static final String DATETIME_FORMAT = "dd-MM-yyyy hh:mm:ss";

    @TypeConverter
    public static Timestamp toTimestamp(String value) throws ParseException {
        return new Timestamp(new SimpleDateFormat(DATETIME_FORMAT, Locale.US).parse(value).getTime());
    }

    @TypeConverter
    public static String fromTimestamp(Timestamp date) {
        return new SimpleDateFormat(DATETIME_FORMAT, Locale.US).format(date);
    }
}
