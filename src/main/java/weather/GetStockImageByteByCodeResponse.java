
package weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getStockImageByteByCodeResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStockImageByteByCodeResult"
})
@XmlRootElement(name = "getStockImageByteByCodeResponse")
public class GetStockImageByteByCodeResponse {

    protected byte[] getStockImageByteByCodeResult;

    /**
     * ��ȡgetStockImageByteByCodeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetStockImageByteByCodeResult() {
        return getStockImageByteByCodeResult;
    }

    /**
     * ����getStockImageByteByCodeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetStockImageByteByCodeResult(byte[] value) {
        this.getStockImageByteByCodeResult = value;
    }

}
