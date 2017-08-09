package catmimigod.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * Created by catmi on 2017/8/9.
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}