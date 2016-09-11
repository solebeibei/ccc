package DP.prototypeDP.prototypeManager;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyang21 on 2016/9/11.
 */
public class PrototypeManager {

    private PrototypeManager() {
    }

    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 从原型管理器里面删除某个原型注册
     *
     * @param prototypeId 原型编号
     */
    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 获取某个原型编号对应的原型实例
     *
     * @param prototypeId 原型编号
     * @return 原型编号对应的原型实例
     * @throws Exception 如果原型编号对应的实例不存在，则抛出异常
     */
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return prototype;
    }
}
