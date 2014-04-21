  CREATE TABLE "TPRY_RESPONSABLES" ("IDRESPONSABLE" NUMBER(*,0), "NOMBRERESPONSABLE" VARCHAR2(10), "APPATERNORESP" VARCHAR2(10), "APMATERNORESP" VARCHAR2(10))
  CREATE UNIQUE INDEX "TPRY_RESPONSABLES_PK" ON "TPRY_RESPONSABLES" ("IDRESPONSABLE")
  ALTER TABLE "TPRY_RESPONSABLES" ADD CONSTRAINT "TPRY_RESPONSABLES_PK" PRIMARY KEY ("IDRESPONSABLE") ENABLE
  ALTER TABLE "TPRY_RESPONSABLES" MODIFY ("APPATERNORESP" NOT NULL ENABLE)
  ALTER TABLE "TPRY_RESPONSABLES" MODIFY ("NOMBRERESPONSABLE" NOT NULL ENABLE)
  ALTER TABLE "TPRY_RESPONSABLES" MODIFY ("IDRESPONSABLE" NOT NULL ENABLE)
