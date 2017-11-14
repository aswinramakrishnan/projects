// ORM class for table 'small'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Apr 29 22:21:16 UTC 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class small extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public small with_date(String date) {
    this.date = date;
    return this;
  }
  private String time;
  public String get_time() {
    return time;
  }
  public void set_time(String time) {
    this.time = time;
  }
  public small with_time(String time) {
    this.time = time;
    return this;
  }
  private String s_ip;
  public String get_s_ip() {
    return s_ip;
  }
  public void set_s_ip(String s_ip) {
    this.s_ip = s_ip;
  }
  public small with_s_ip(String s_ip) {
    this.s_ip = s_ip;
    return this;
  }
  private String cs_method;
  public String get_cs_method() {
    return cs_method;
  }
  public void set_cs_method(String cs_method) {
    this.cs_method = cs_method;
  }
  public small with_cs_method(String cs_method) {
    this.cs_method = cs_method;
    return this;
  }
  private String cs_uri_stem;
  public String get_cs_uri_stem() {
    return cs_uri_stem;
  }
  public void set_cs_uri_stem(String cs_uri_stem) {
    this.cs_uri_stem = cs_uri_stem;
  }
  public small with_cs_uri_stem(String cs_uri_stem) {
    this.cs_uri_stem = cs_uri_stem;
    return this;
  }
  private String cs_uri_query;
  public String get_cs_uri_query() {
    return cs_uri_query;
  }
  public void set_cs_uri_query(String cs_uri_query) {
    this.cs_uri_query = cs_uri_query;
  }
  public small with_cs_uri_query(String cs_uri_query) {
    this.cs_uri_query = cs_uri_query;
    return this;
  }
  private Integer s_port;
  public Integer get_s_port() {
    return s_port;
  }
  public void set_s_port(Integer s_port) {
    this.s_port = s_port;
  }
  public small with_s_port(Integer s_port) {
    this.s_port = s_port;
    return this;
  }
  private String cs_username;
  public String get_cs_username() {
    return cs_username;
  }
  public void set_cs_username(String cs_username) {
    this.cs_username = cs_username;
  }
  public small with_cs_username(String cs_username) {
    this.cs_username = cs_username;
    return this;
  }
  private String c_ip;
  public String get_c_ip() {
    return c_ip;
  }
  public void set_c_ip(String c_ip) {
    this.c_ip = c_ip;
  }
  public small with_c_ip(String c_ip) {
    this.c_ip = c_ip;
    return this;
  }
  private String cs_user_agent;
  public String get_cs_user_agent() {
    return cs_user_agent;
  }
  public void set_cs_user_agent(String cs_user_agent) {
    this.cs_user_agent = cs_user_agent;
  }
  public small with_cs_user_agent(String cs_user_agent) {
    this.cs_user_agent = cs_user_agent;
    return this;
  }
  private String sc_status;
  public String get_sc_status() {
    return sc_status;
  }
  public void set_sc_status(String sc_status) {
    this.sc_status = sc_status;
  }
  public small with_sc_status(String sc_status) {
    this.sc_status = sc_status;
    return this;
  }
  private String sc_substatus;
  public String get_sc_substatus() {
    return sc_substatus;
  }
  public void set_sc_substatus(String sc_substatus) {
    this.sc_substatus = sc_substatus;
  }
  public small with_sc_substatus(String sc_substatus) {
    this.sc_substatus = sc_substatus;
    return this;
  }
  private String sc_win_status;
  public String get_sc_win_status() {
    return sc_win_status;
  }
  public void set_sc_win_status(String sc_win_status) {
    this.sc_win_status = sc_win_status;
  }
  public small with_sc_win_status(String sc_win_status) {
    this.sc_win_status = sc_win_status;
    return this;
  }
  private String time_taken;
  public String get_time_taken() {
    return time_taken;
  }
  public void set_time_taken(String time_taken) {
    this.time_taken = time_taken;
  }
  public small with_time_taken(String time_taken) {
    this.time_taken = time_taken;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof small)) {
      return false;
    }
    small that = (small) o;
    boolean equal = true;
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.s_ip == null ? that.s_ip == null : this.s_ip.equals(that.s_ip));
    equal = equal && (this.cs_method == null ? that.cs_method == null : this.cs_method.equals(that.cs_method));
    equal = equal && (this.cs_uri_stem == null ? that.cs_uri_stem == null : this.cs_uri_stem.equals(that.cs_uri_stem));
    equal = equal && (this.cs_uri_query == null ? that.cs_uri_query == null : this.cs_uri_query.equals(that.cs_uri_query));
    equal = equal && (this.s_port == null ? that.s_port == null : this.s_port.equals(that.s_port));
    equal = equal && (this.cs_username == null ? that.cs_username == null : this.cs_username.equals(that.cs_username));
    equal = equal && (this.c_ip == null ? that.c_ip == null : this.c_ip.equals(that.c_ip));
    equal = equal && (this.cs_user_agent == null ? that.cs_user_agent == null : this.cs_user_agent.equals(that.cs_user_agent));
    equal = equal && (this.sc_status == null ? that.sc_status == null : this.sc_status.equals(that.sc_status));
    equal = equal && (this.sc_substatus == null ? that.sc_substatus == null : this.sc_substatus.equals(that.sc_substatus));
    equal = equal && (this.sc_win_status == null ? that.sc_win_status == null : this.sc_win_status.equals(that.sc_win_status));
    equal = equal && (this.time_taken == null ? that.time_taken == null : this.time_taken.equals(that.time_taken));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof small)) {
      return false;
    }
    small that = (small) o;
    boolean equal = true;
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.time == null ? that.time == null : this.time.equals(that.time));
    equal = equal && (this.s_ip == null ? that.s_ip == null : this.s_ip.equals(that.s_ip));
    equal = equal && (this.cs_method == null ? that.cs_method == null : this.cs_method.equals(that.cs_method));
    equal = equal && (this.cs_uri_stem == null ? that.cs_uri_stem == null : this.cs_uri_stem.equals(that.cs_uri_stem));
    equal = equal && (this.cs_uri_query == null ? that.cs_uri_query == null : this.cs_uri_query.equals(that.cs_uri_query));
    equal = equal && (this.s_port == null ? that.s_port == null : this.s_port.equals(that.s_port));
    equal = equal && (this.cs_username == null ? that.cs_username == null : this.cs_username.equals(that.cs_username));
    equal = equal && (this.c_ip == null ? that.c_ip == null : this.c_ip.equals(that.c_ip));
    equal = equal && (this.cs_user_agent == null ? that.cs_user_agent == null : this.cs_user_agent.equals(that.cs_user_agent));
    equal = equal && (this.sc_status == null ? that.sc_status == null : this.sc_status.equals(that.sc_status));
    equal = equal && (this.sc_substatus == null ? that.sc_substatus == null : this.sc_substatus.equals(that.sc_substatus));
    equal = equal && (this.sc_win_status == null ? that.sc_win_status == null : this.sc_win_status.equals(that.sc_win_status));
    equal = equal && (this.time_taken == null ? that.time_taken == null : this.time_taken.equals(that.time_taken));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.date = JdbcWritableBridge.readString(1, __dbResults);
    this.time = JdbcWritableBridge.readString(2, __dbResults);
    this.s_ip = JdbcWritableBridge.readString(3, __dbResults);
    this.cs_method = JdbcWritableBridge.readString(4, __dbResults);
    this.cs_uri_stem = JdbcWritableBridge.readString(5, __dbResults);
    this.cs_uri_query = JdbcWritableBridge.readString(6, __dbResults);
    this.s_port = JdbcWritableBridge.readInteger(7, __dbResults);
    this.cs_username = JdbcWritableBridge.readString(8, __dbResults);
    this.c_ip = JdbcWritableBridge.readString(9, __dbResults);
    this.cs_user_agent = JdbcWritableBridge.readString(10, __dbResults);
    this.sc_status = JdbcWritableBridge.readString(11, __dbResults);
    this.sc_substatus = JdbcWritableBridge.readString(12, __dbResults);
    this.sc_win_status = JdbcWritableBridge.readString(13, __dbResults);
    this.time_taken = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.date = JdbcWritableBridge.readString(1, __dbResults);
    this.time = JdbcWritableBridge.readString(2, __dbResults);
    this.s_ip = JdbcWritableBridge.readString(3, __dbResults);
    this.cs_method = JdbcWritableBridge.readString(4, __dbResults);
    this.cs_uri_stem = JdbcWritableBridge.readString(5, __dbResults);
    this.cs_uri_query = JdbcWritableBridge.readString(6, __dbResults);
    this.s_port = JdbcWritableBridge.readInteger(7, __dbResults);
    this.cs_username = JdbcWritableBridge.readString(8, __dbResults);
    this.c_ip = JdbcWritableBridge.readString(9, __dbResults);
    this.cs_user_agent = JdbcWritableBridge.readString(10, __dbResults);
    this.sc_status = JdbcWritableBridge.readString(11, __dbResults);
    this.sc_substatus = JdbcWritableBridge.readString(12, __dbResults);
    this.sc_win_status = JdbcWritableBridge.readString(13, __dbResults);
    this.time_taken = JdbcWritableBridge.readString(14, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(s_ip, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_method, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_uri_stem, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_uri_query, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(s_port, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cs_username, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(c_ip, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_user_agent, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_status, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_substatus, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_win_status, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_taken, 14 + __off, 12, __dbStmt);
    return 14;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(date, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(s_ip, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_method, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_uri_stem, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_uri_query, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(s_port, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(cs_username, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(c_ip, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cs_user_agent, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_status, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_substatus, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sc_win_status, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(time_taken, 14 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time = null;
    } else {
    this.time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.s_ip = null;
    } else {
    this.s_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cs_method = null;
    } else {
    this.cs_method = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cs_uri_stem = null;
    } else {
    this.cs_uri_stem = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cs_uri_query = null;
    } else {
    this.cs_uri_query = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.s_port = null;
    } else {
    this.s_port = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cs_username = null;
    } else {
    this.cs_username = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.c_ip = null;
    } else {
    this.c_ip = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cs_user_agent = null;
    } else {
    this.cs_user_agent = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sc_status = null;
    } else {
    this.sc_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sc_substatus = null;
    } else {
    this.sc_substatus = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sc_win_status = null;
    } else {
    this.sc_win_status = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.time_taken = null;
    } else {
    this.time_taken = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time);
    }
    if (null == this.s_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, s_ip);
    }
    if (null == this.cs_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_method);
    }
    if (null == this.cs_uri_stem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_uri_stem);
    }
    if (null == this.cs_uri_query) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_uri_query);
    }
    if (null == this.s_port) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.s_port);
    }
    if (null == this.cs_username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_username);
    }
    if (null == this.c_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, c_ip);
    }
    if (null == this.cs_user_agent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_user_agent);
    }
    if (null == this.sc_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_status);
    }
    if (null == this.sc_substatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_substatus);
    }
    if (null == this.sc_win_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_win_status);
    }
    if (null == this.time_taken) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_taken);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time);
    }
    if (null == this.s_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, s_ip);
    }
    if (null == this.cs_method) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_method);
    }
    if (null == this.cs_uri_stem) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_uri_stem);
    }
    if (null == this.cs_uri_query) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_uri_query);
    }
    if (null == this.s_port) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.s_port);
    }
    if (null == this.cs_username) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_username);
    }
    if (null == this.c_ip) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, c_ip);
    }
    if (null == this.cs_user_agent) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cs_user_agent);
    }
    if (null == this.sc_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_status);
    }
    if (null == this.sc_substatus) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_substatus);
    }
    if (null == this.sc_win_status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sc_win_status);
    }
    if (null == this.time_taken) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, time_taken);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(s_ip==null?"null":s_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_method==null?"null":cs_method, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_uri_stem==null?"null":cs_uri_stem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_uri_query==null?"null":cs_uri_query, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(s_port==null?"null":"" + s_port, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_username==null?"null":cs_username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(c_ip==null?"null":c_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_user_agent==null?"null":cs_user_agent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_status==null?"null":sc_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_substatus==null?"null":sc_substatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_win_status==null?"null":sc_win_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_taken==null?"null":time_taken, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time==null?"null":time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(s_ip==null?"null":s_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_method==null?"null":cs_method, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_uri_stem==null?"null":cs_uri_stem, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_uri_query==null?"null":cs_uri_query, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(s_port==null?"null":"" + s_port, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_username==null?"null":cs_username, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(c_ip==null?"null":c_ip, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cs_user_agent==null?"null":cs_user_agent, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_status==null?"null":sc_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_substatus==null?"null":sc_substatus, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sc_win_status==null?"null":sc_win_status, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(time_taken==null?"null":time_taken, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time = null; } else {
      this.time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.s_ip = null; } else {
      this.s_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_method = null; } else {
      this.cs_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_uri_stem = null; } else {
      this.cs_uri_stem = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_uri_query = null; } else {
      this.cs_uri_query = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.s_port = null; } else {
      this.s_port = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_username = null; } else {
      this.cs_username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.c_ip = null; } else {
      this.c_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_user_agent = null; } else {
      this.cs_user_agent = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_status = null; } else {
      this.sc_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_substatus = null; } else {
      this.sc_substatus = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_win_status = null; } else {
      this.sc_win_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_taken = null; } else {
      this.time_taken = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time = null; } else {
      this.time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.s_ip = null; } else {
      this.s_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_method = null; } else {
      this.cs_method = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_uri_stem = null; } else {
      this.cs_uri_stem = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_uri_query = null; } else {
      this.cs_uri_query = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.s_port = null; } else {
      this.s_port = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_username = null; } else {
      this.cs_username = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.c_ip = null; } else {
      this.c_ip = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cs_user_agent = null; } else {
      this.cs_user_agent = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_status = null; } else {
      this.sc_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_substatus = null; } else {
      this.sc_substatus = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.sc_win_status = null; } else {
      this.sc_win_status = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.time_taken = null; } else {
      this.time_taken = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    small o = (small) super.clone();
    return o;
  }

  public void clone0(small o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("s_ip", this.s_ip);
    __sqoop$field_map.put("cs_method", this.cs_method);
    __sqoop$field_map.put("cs_uri_stem", this.cs_uri_stem);
    __sqoop$field_map.put("cs_uri_query", this.cs_uri_query);
    __sqoop$field_map.put("s_port", this.s_port);
    __sqoop$field_map.put("cs_username", this.cs_username);
    __sqoop$field_map.put("c_ip", this.c_ip);
    __sqoop$field_map.put("cs_user_agent", this.cs_user_agent);
    __sqoop$field_map.put("sc_status", this.sc_status);
    __sqoop$field_map.put("sc_substatus", this.sc_substatus);
    __sqoop$field_map.put("sc_win_status", this.sc_win_status);
    __sqoop$field_map.put("time_taken", this.time_taken);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("time", this.time);
    __sqoop$field_map.put("s_ip", this.s_ip);
    __sqoop$field_map.put("cs_method", this.cs_method);
    __sqoop$field_map.put("cs_uri_stem", this.cs_uri_stem);
    __sqoop$field_map.put("cs_uri_query", this.cs_uri_query);
    __sqoop$field_map.put("s_port", this.s_port);
    __sqoop$field_map.put("cs_username", this.cs_username);
    __sqoop$field_map.put("c_ip", this.c_ip);
    __sqoop$field_map.put("cs_user_agent", this.cs_user_agent);
    __sqoop$field_map.put("sc_status", this.sc_status);
    __sqoop$field_map.put("sc_substatus", this.sc_substatus);
    __sqoop$field_map.put("sc_win_status", this.sc_win_status);
    __sqoop$field_map.put("time_taken", this.time_taken);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (String) __fieldVal;
    }
    else    if ("s_ip".equals(__fieldName)) {
      this.s_ip = (String) __fieldVal;
    }
    else    if ("cs_method".equals(__fieldName)) {
      this.cs_method = (String) __fieldVal;
    }
    else    if ("cs_uri_stem".equals(__fieldName)) {
      this.cs_uri_stem = (String) __fieldVal;
    }
    else    if ("cs_uri_query".equals(__fieldName)) {
      this.cs_uri_query = (String) __fieldVal;
    }
    else    if ("s_port".equals(__fieldName)) {
      this.s_port = (Integer) __fieldVal;
    }
    else    if ("cs_username".equals(__fieldName)) {
      this.cs_username = (String) __fieldVal;
    }
    else    if ("c_ip".equals(__fieldName)) {
      this.c_ip = (String) __fieldVal;
    }
    else    if ("cs_user_agent".equals(__fieldName)) {
      this.cs_user_agent = (String) __fieldVal;
    }
    else    if ("sc_status".equals(__fieldName)) {
      this.sc_status = (String) __fieldVal;
    }
    else    if ("sc_substatus".equals(__fieldName)) {
      this.sc_substatus = (String) __fieldVal;
    }
    else    if ("sc_win_status".equals(__fieldName)) {
      this.sc_win_status = (String) __fieldVal;
    }
    else    if ("time_taken".equals(__fieldName)) {
      this.time_taken = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
      return true;
    }
    else    if ("time".equals(__fieldName)) {
      this.time = (String) __fieldVal;
      return true;
    }
    else    if ("s_ip".equals(__fieldName)) {
      this.s_ip = (String) __fieldVal;
      return true;
    }
    else    if ("cs_method".equals(__fieldName)) {
      this.cs_method = (String) __fieldVal;
      return true;
    }
    else    if ("cs_uri_stem".equals(__fieldName)) {
      this.cs_uri_stem = (String) __fieldVal;
      return true;
    }
    else    if ("cs_uri_query".equals(__fieldName)) {
      this.cs_uri_query = (String) __fieldVal;
      return true;
    }
    else    if ("s_port".equals(__fieldName)) {
      this.s_port = (Integer) __fieldVal;
      return true;
    }
    else    if ("cs_username".equals(__fieldName)) {
      this.cs_username = (String) __fieldVal;
      return true;
    }
    else    if ("c_ip".equals(__fieldName)) {
      this.c_ip = (String) __fieldVal;
      return true;
    }
    else    if ("cs_user_agent".equals(__fieldName)) {
      this.cs_user_agent = (String) __fieldVal;
      return true;
    }
    else    if ("sc_status".equals(__fieldName)) {
      this.sc_status = (String) __fieldVal;
      return true;
    }
    else    if ("sc_substatus".equals(__fieldName)) {
      this.sc_substatus = (String) __fieldVal;
      return true;
    }
    else    if ("sc_win_status".equals(__fieldName)) {
      this.sc_win_status = (String) __fieldVal;
      return true;
    }
    else    if ("time_taken".equals(__fieldName)) {
      this.time_taken = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
