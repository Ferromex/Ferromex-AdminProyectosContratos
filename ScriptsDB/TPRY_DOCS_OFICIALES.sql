--------------------------------------------------------
-- Archivo creado  - viernes-abril-04-2014   
--------------------------------------------------------
DROP TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" cascade constraints;
DROP TABLE "REFERENCIA"."TPRY_EMPRESA" cascade constraints;
DROP TABLE "REFERENCIA"."TPRY_PROVEEDORES" cascade constraints;
DROP TABLE "REFERENCIA"."TPRY_PROYECTOS" cascade constraints;
DROP TABLE "REFERENCIA"."TPRY_RESPONSABLES" cascade constraints;
DROP TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" cascade constraints;
--------------------------------------------------------
--  DDL for Table TPRY_DOCS_OFICIALES
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" 
   (	"DOCS_ID" NUMBER, 
	"DOCS_FOLIO" VARCHAR2(50 BYTE), 
	"EMPR_ID" VARCHAR2(5 BYTE), 
	"DOCS_FECHA_ELABORACION" TIMESTAMP (6), 
	"TDOC_ID" NUMBER(*,0), 
	"PROV_ID" NUMBER(*,0), 
	"DOCS_DIRIGIDOA" VARCHAR2(80 BYTE), 
	"PROY_ID" NUMBER(*,0), 
	"RESP_ID" NUMBER(*,0), 
	"DOCS_OBSERVACIONES" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  DDL for Table TPRY_EMPRESA
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_EMPRESA" 
   (	"EMPR_ID" VARCHAR2(5 BYTE), 
	"EMPR_NOMBRE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  DDL for Table TPRY_PROVEEDORES
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_PROVEEDORES" 
   (	"PROV_ID" NUMBER, 
	"PROV_RAZON_SOCIAL" VARCHAR2(100 BYTE), 
	"PROV_DOM_FISCAL" VARCHAR2(200 BYTE), 
	"PROV_DOM_CORRESP" VARCHAR2(200 BYTE), 
	"PROV_REGISTRO_ABAST" NUMBER, 
	"PROV_REGISTRO_PROY" NUMBER, 
	"ZPRO_ID" NUMBER
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  DDL for Table TPRY_PROYECTOS
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_PROYECTOS" 
   (	"PROY_ID" NUMBER, 
	"PROY_CARPETA" NUMBER, 
	"EMPR_ID" VARCHAR2(5 BYTE), 
	"PROY_NOMBRE" VARCHAR2(400 BYTE), 
	"PROY_NOMBRE_CORTO" VARCHAR2(200 BYTE), 
	"TOBR_ID" NUMBER, 
	"ORGP_ID" NUMBER, 
	"DIVP_ID" NUMBER, 
	"PROY_FECHA_RECEP_INF" TIMESTAMP (6), 
	"PROY_PRESUPUESTO" NUMBER, 
	"PROY_ELEMENTO_PEP" VARCHAR2(20 BYTE), 
	"PROY_CENTRO_COSTOS" VARCHAR2(200 BYTE), 
	"PROY_SOL_INVERSION" VARCHAR2(1 BYTE), 
	"PROY_FECH_ENTREGA_SAI" TIMESTAMP (6), 
	"PROY_SOLICITUD_SAP" NUMBER, 
	"PROY_FECH_INICIO_ESTIMADO" TIMESTAMP (6), 
	"PROY_FECH_FIN_ESTIMADO" TIMESTAMP (6), 
	"PROY_DURACION_PROY" NUMBER, 
	"PROY_FECH_INICIO_REAL" TIMESTAMP (6), 
	"PROY_FECH_FIN_REAL" TIMESTAMP (6)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  DDL for Table TPRY_RESPONSABLES
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_RESPONSABLES" 
   (	"RESP_ID" NUMBER, 
	"RESP_NOMBRE" VARCHAR2(10 BYTE), 
	"RESP_AP_PATERNO" VARCHAR2(10 BYTE), 
	"RESP_AP_MATERNO" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  DDL for Table TPRY_TIPO_DOCUMENTO
--------------------------------------------------------

  CREATE TABLE "REFERENCIA"."TPRY_TIPO_DOCUMENTO" 
   (	"TDOC_ID" NUMBER, 
	"TDOC_NOMBRE" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
REM INSERTING into REFERENCIA.TPRY_DOCS_OFICIALES
SET DEFINE OFF;
Insert into REFERENCIA.TPRY_DOCS_OFICIALES (DOCS_ID,DOCS_FOLIO,EMPR_ID,DOCS_FECHA_ELABORACION,TDOC_ID,PROV_ID,DOCS_DIRIGIDOA,PROY_ID,RESP_ID,DOCS_OBSERVACIONES) values (55,'FXE-GIBP-55-OBRA-14','FXE',to_timestamp('04/04/14 00:00:00.000000000','DD/MM/RR HH24:MI:SS.FF'),10,86,'Alguien',4,3,'Tercer Doc Completo');
Insert into REFERENCIA.TPRY_DOCS_OFICIALES (DOCS_ID,DOCS_FOLIO,EMPR_ID,DOCS_FECHA_ELABORACION,TDOC_ID,PROV_ID,DOCS_DIRIGIDOA,PROY_ID,RESP_ID,DOCS_OBSERVACIONES) values (53,'FXE-GIBP-53-14','FXE',to_timestamp('04/04/14 00:00:00.000000000','DD/MM/RR HH24:MI:SS.FF'),3,86,'Alguien',null,1,'Primer Doc completo');
Insert into REFERENCIA.TPRY_DOCS_OFICIALES (DOCS_ID,DOCS_FOLIO,EMPR_ID,DOCS_FECHA_ELABORACION,TDOC_ID,PROV_ID,DOCS_DIRIGIDOA,PROY_ID,RESP_ID,DOCS_OBSERVACIONES) values (54,'FSRR-GIBP-54-14','FSRR',to_timestamp('03/04/14 00:00:00.000000000','DD/MM/RR HH24:MI:SS.FF'),7,87,'TODOS',5,5,'Segundo Doc completo');
Insert into REFERENCIA.TPRY_DOCS_OFICIALES (DOCS_ID,DOCS_FOLIO,EMPR_ID,DOCS_FECHA_ELABORACION,TDOC_ID,PROV_ID,DOCS_DIRIGIDOA,PROY_ID,RESP_ID,DOCS_OBSERVACIONES) values (56,'FXE-GIBP-56-14','FXE',to_timestamp('04/04/14 00:00:00.000000000','DD/MM/RR HH24:MI:SS.FF'),3,86,'Alguien',4,3,'Cuarto Doc Completo');
Insert into REFERENCIA.TPRY_DOCS_OFICIALES (DOCS_ID,DOCS_FOLIO,EMPR_ID,DOCS_FECHA_ELABORACION,TDOC_ID,PROV_ID,DOCS_DIRIGIDOA,PROY_ID,RESP_ID,DOCS_OBSERVACIONES) values (57,'FSRR-GIBP-57-14','FSRR',to_timestamp('04/04/14 00:00:00.000000000','DD/MM/RR HH24:MI:SS.FF'),3,91,'TODOS',6,3,'Quinto Doc Completo');
--------------------------------------------------------
--  DDL for Index TPRYDOCS_OFICIALES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "REFERENCIA"."TPRYDOCS_OFICIALES_PK" ON "REFERENCIA"."TPRY_DOCS_OFICIALES" ("DOCS_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA" ;
--------------------------------------------------------
--  Constraints for Table TPRY_DOCS_OFICIALES
--------------------------------------------------------

  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "PK01_DOCS_ID" PRIMARY KEY ("DOCS_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "DATA"  ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" MODIFY ("EMPR_ID" NOT NULL ENABLE);
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" MODIFY ("DOCS_ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TPRY_DOCS_OFICIALES
--------------------------------------------------------

  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "FK01_DOCS_EMPR_ID" FOREIGN KEY ("EMPR_ID")
	  REFERENCES "REFERENCIA"."TPRY_EMPRESA" ("EMPR_ID") ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "FK02_DOCS_TDOC_ID" FOREIGN KEY ("TDOC_ID")
	  REFERENCES "REFERENCIA"."TPRY_TIPO_DOCUMENTO" ("TDOC_ID") ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "FK03_DOCS_PROY_ID" FOREIGN KEY ("PROY_ID")
	  REFERENCES "REFERENCIA"."TPRY_PROYECTOS" ("PROY_ID") ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "FK04_DOCS_RESP_ID" FOREIGN KEY ("RESP_ID")
	  REFERENCES "REFERENCIA"."TPRY_RESPONSABLES" ("RESP_ID") ENABLE;
  ALTER TABLE "REFERENCIA"."TPRY_DOCS_OFICIALES" ADD CONSTRAINT "FK05_DOCS_PROV_ID" FOREIGN KEY ("PROV_ID")
	  REFERENCES "REFERENCIA"."TPRY_PROVEEDORES" ("PROV_ID") ENABLE;
