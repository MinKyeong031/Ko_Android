package com.example.ch04_calculator.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.ch04_calculator.model.History;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryDao_Impl implements HistoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<History> __insertionAdapterOfHistory;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HistoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistory = new EntityInsertionAdapter<History>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `History` (`uid`,`expression`,`result`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, History value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        if (value.getExpression() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getExpression());
        }
        if (value.getResult() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getResult());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM history";
        return _query;
      }
    };
  }

  @Override
  public void insertHistory(final History history) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHistory.insert(history);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<History> getAll() {
    final String _sql = "SELECT * FROM history";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfExpression = CursorUtil.getColumnIndexOrThrow(_cursor, "expression");
      final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
      final List<History> _result = new ArrayList<History>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final History _item;
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpExpression;
        if (_cursor.isNull(_cursorIndexOfExpression)) {
          _tmpExpression = null;
        } else {
          _tmpExpression = _cursor.getString(_cursorIndexOfExpression);
        }
        final String _tmpResult;
        if (_cursor.isNull(_cursorIndexOfResult)) {
          _tmpResult = null;
        } else {
          _tmpResult = _cursor.getString(_cursorIndexOfResult);
        }
        _item = new History(_tmpUid,_tmpExpression,_tmpResult);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
