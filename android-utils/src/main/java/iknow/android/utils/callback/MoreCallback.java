package iknow.android.utils.callback;

/**
 * Author：J.Chou
 * Date：  2016.07.20 19:02.
 * Email： who_know_me@163.com
 * Describe:
 */
public interface MoreCallback<V,K> extends SingleCallback {
    void onMoreCallback(V v,K k);
}
