package com.biva.multicast;

import java.sql.Date;
import mx.com.biva.codec.core.vo.ClosingPriceVO;

public class Message {
public String Name;
public String Type;
public Long Timestamp;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public Long getTimestamp() {
	return Timestamp;
}
public void setTimestamp(Long timestamp) {
	Timestamp = timestamp;
}

public ClosingPriceVO closingPriceVO;

}
