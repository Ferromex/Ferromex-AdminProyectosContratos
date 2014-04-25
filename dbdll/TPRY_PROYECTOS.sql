  CREATE TABLE "TPRY_PROYECTOS" ("IDPROYECTO" NUMBER(*,0), "COLUMN2" VARCHAR2(20), "COLUMN3" VARCHAR2(20), "COLUMN4" VARCHAR2(20), "COLUMN5" VARCHAR2(20))
  CREATE UNIQUE INDEX "TPRY_PROYECTOS_PK" ON "TPRY_PROYECTOS" ("IDPROYECTO")
  ALTER TABLE "TPRY_PROYECTOS" ADD CONSTRAINT "TPRY_PROYECTOS_PK" PRIMARY KEY ("IDPROYECTO") ENABLE
  ALTER TABLE "TPRY_PROYECTOS" MODIFY ("IDPROYECTO" NOT NULL ENABLE)