package com.npc.CustomTypes;

// import java.sql.Array;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Types;

// import org.hibernate.engine.spi.SharedSessionContractImplementor;
// import org.hibernate.usertype.UserType;

// public class CustomIntArrayType implements UserType<Integer[]> {

//     public int sqlType() {
//         return Types.ARRAY;
//     }

//     @Override
//     public Class returnedClass() {
//         return Integer[].class;
//     }

//     @Override
//     public Integer[] nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner)
//             throws SQLException {
//         Array array = rs.getArray(position);
//         return array != null ? (Integer[]) array.getArray() : null;
//     }

//     @Override
//     public void nullSafeSet(PreparedStatement st, Integer[] value, int index, SharedSessionContractImplementor session)
//             throws SQLException {
//         if (st != null) {
//             if (value != null) {
//                 Array array = session.getJdbcConnectionAccess().obtainConnection().createArrayOf("integer", value);
//                 st.setArray(index, array);
//             } else {
//                 st.setNull(index, Types.ARRAY);
//             }
//         }
//     }

//     @Override
//     public Integer[] assemble(Integer[] cached, Object owner) {
//         return null;
//     }
// }