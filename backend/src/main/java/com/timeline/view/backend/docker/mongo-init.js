db = db.getSiblingDB("mongo_events_db");

db.createUser({
    user: "user",
    pwd: "password",
    roles: [{ role: "dbOwner", db: "mongo_events_db" }],
});