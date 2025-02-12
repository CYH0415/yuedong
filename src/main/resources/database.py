from sqlalchemy import create_engine, Column, Integer, Float, String, DateTime, TIMESTAMP, Double, Text, BLOB, ForeignKey
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker
from sqlalchemy_utils import database_exists, create_database, drop_database
from datetime import datetime, timedelta
import time
import random

# python2: MySQLdb
# python3: pymysql
# 使用create_engine建立同数据库的连接，返回的是一个Engine实例
# 指向数据库的一些核心的接口
# echo=True， 可以在控制台看到操作涉及的SQL语言

# 数据库配置 -> 换成自己的
username = ""
password = ""
database = "yuedong"

# session = Session()
# 声明基类
Base = declarative_base()
# 基于这个基类来创建我们的自定义类，一个类就是一个数据库表


class user(Base):
    __tablename__ = 'user'
    openID = Column(String(20), nullable=False, primary_key=True)
    username = Column(String(20), nullable=False)
    sex = Column(Integer, nullable=False)
    phone = Column(String(20), nullable=False)

class venue(Base):
    __tablename__ = 'venue'
    venueID = Column(String(20), nullable=False, primary_key=True)
    venueName = Column(String(20), nullable=False)
    venueAddr = Column(String(40), nullable=False)
    score = Column(Double)

class session(Base):
    __tablename__ = 'session'
    sessionID = Column(String(20), nullable=False, primary_key=True)
    venueID = Column(String(20), ForeignKey(venue.venueID), nullable=False)
    region = Column(String(20), nullable=False)
    date = Column(String(20), nullable=False)
    stratTime = Column(String(20), nullable=False)
    endTime = Column(String(20), nullable=False)
    price = Column(Double, nullable=False)
    status = Column(Integer, nullable=False)

class order(Base):
    __tablename__ = 'order'
    orderID = Column(String(20), nullable=False, primary_key=True)
    openID = Column(String(20), ForeignKey(user.openID), nullable=False)
    venueID = Column(String(20), ForeignKey(venue.venueID), nullable=False)
    sessionID = Column(String(20), ForeignKey(session.sessionID), nullable=False)
    money = Column(Double, nullable=False)
    status = Column(Integer, nullable=False)
    time = Column(String(20))


# 新增函数，若有旧的数据库则删除，没有则创建新的数据库，便于修改表结构
def drop_and_create_database(engine):
    if database_exists(engine.url):
        print(f"Deleting database {database}")
        drop_database(engine.url)
    print(f"Creating database {database}")
    create_database(engine.url)


if __name__ == '__main__':
    # 连接到 MySQL 服务器（不指定数据库）
    engine = create_engine(
        f"mysql+pymysql://{username}:{password}@127.0.0.1:3306/{database}", echo=True)

    # 若有旧的数据库则删除，没有则创建新的数据库
    drop_and_create_database(engine)

    # 重新连接到新创建的数据库
    engine = create_engine(
        f"mysql+pymysql://{username}:{password}@127.0.0.1:3306/{database}", echo=True)

    # 检查表的存在性，如果不存在的话会执行表的创建工作
    Base.metadata.create_all(bind=engine)

    # 创建缓存对象
    Session = sessionmaker(bind=engine)
    database_session = Session()
    
    # 测试用户数据
    test_users = [
        user(openID='openid1', username='Alice', sex=1, phone='12345678901'),
        user(openID='openid2', username='Bob', sex=0, phone='12345678902')
    ]
    database_session.add_all(test_users)
    database_session.commit()

    # 测试场地数据
    test_venues = [
        venue(venueID='venue1', venueName='Venue A', venueAddr='Address A', score=4.5),
        venue(venueID='venue2', venueName='Venue B', venueAddr='Address B', score=4.0)
    ]
    database_session.add_all(test_venues)
    database_session.commit()

    # 测试场次数据
    test_sessions = [
        session(sessionID='sess1', venueID='venue1', region='Region X', date='2025/01/16', stratTime='10:00:00', endTime='12:00:00', price=100.0, status=1),
        session(sessionID='sess2', venueID='venue2', region='Region Y', date='2025/01/16', stratTime='14:00:00', endTime='16:00:00', price=120.0, status=1)
    ]
    database_session.add_all(test_sessions)
    database_session.commit()

    # 测试订单数据
    test_orders = [
        order(orderID='order1', openID='openid1', venueID='venue1', sessionID='sess1', money=100.0, status=1, time="2025/01/16 14:23:56"),
        order(orderID='order2', openID='openid2', venueID='venue2', sessionID='sess2', money=120.0, status=1, time="2025/01/16 15:33:21")
    ]
    database_session.add_all(test_orders)
    database_session.commit()
